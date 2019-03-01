import java.io.*;
import java.util.*;

public class slikar {
	
	private static char[][] map;
	private static boolean[][] visited;
	private static Queue<Node> queue;
	private static Queue<Node> floods;

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		visited = new boolean[r][c];
		queue = new LinkedList<Node>();
		floods = new LinkedList<Node>();
		Node end = null;
		for(int i = 0; i < r; i++) {
			String line = in.readLine();
			for(int j = 0; j < c; j++) {
				map[i][j] = line.charAt(j);
				if(map[i][j] == 'S') 
					queue.add(new Node(i, j, 0));
				else if(map[i][j] == '*')
					floods.add(new Node(i, j));
				else if(map[i][j] == 'D')
					end = new Node(i, j);
			}	
		}
		int count = Integer.MAX_VALUE;
		bfs: {
			while(!queue.isEmpty()) {
				// printMap(out);
				// out.println();
				int size = floods.size();
				Node temp = null;
				while(size-- > 0) {
					Node curr = floods.poll();
					if(validLoc(curr.r + 1, curr.c, true) && !visited[curr.r + 1][curr.c]) {
						map[curr.r + 1][curr.c] = '*';
						floods.add(new Node(curr.r + 1, curr.c));
					}
					if(validLoc(curr.r + 1, curr.c, true) && !visited[curr.r + 1][curr.c]) {
						map[curr.r + 1][curr.c] = '*';
						floods.add(new Node(curr.r + 1, curr.c));
					}
					if(validLoc(curr.r, curr.c + 1, true) && !visited[curr.r][curr.c + 1]) {
						map[curr.r][curr.c + 1] = '*';
						floods.add(new Node(curr.r, curr.c + 1));
					}
					if(validLoc(curr.r, curr.c - 1, true) && !visited[curr.r][curr.c - 1]) {
						map[curr.r][curr.c - 1] = '*';
						floods.add(new Node(curr.r, curr.c - 1));
					}
				}

				size = queue.size();
				while(size-- > 0) {
					Node curr = queue.poll();
					if(validLoc(curr.r + 1, curr.c, false) && !visited[curr.r + 1][curr.c]) {
						visited[curr.r + 1][curr.c] = true;
						temp = new Node(curr.r + 1, curr.c, curr.count + 1);
						// out.println(temp.count);
						queue.add(temp);
						if(temp.equals(end)) {
							count = temp.count;
							break bfs;
						}
					}
					if(validLoc(curr.r - 1, curr.c, false) && !visited[curr.r - 1][curr.c]) {
						visited[curr.r - 1][curr.c] = true;
						temp = new Node(curr.r - 1, curr.c, curr.count + 1);
						// out.println(temp.count);
						queue.add(temp);
						if(temp.equals(end)) {
							count = temp.count;
							break bfs;
						}
					}
					if(validLoc(curr.r, curr.c + 1, false) && !visited[curr.r][curr.c + 1]) {
						visited[curr.r][curr.c + 1] = true;
						temp = new Node(curr.r, curr.c + 1, curr.count + 1);
						// out.println(temp.count);
						queue.add(temp);
						if(temp.equals(end)) {
							count = temp.count;
							break bfs;
						}
					}
					if(validLoc(curr.r, curr.c - 1, false) && !visited[curr.r][curr.c - 1]) {
						visited[curr.r][curr.c - 1] = true;
						temp = new Node(curr.r, curr.c - 1, curr.count + 1);
						// out.println(temp.count);
						queue.add(temp);
						if(temp.equals(end)) {
							count = temp.count;
							break bfs;
						}
					} 
				}
			}
		}
		out.println(count == Integer.MAX_VALUE ? "KAKTUS" : count);
		out.close();
	}

	private static boolean validLoc(int r, int c, boolean fire) {
		return r >= 0 && r < map.length && c >= 0 && c < map[0].length && map[r][c] != 'X' && map[r][c] != '*' && (!fire || fire && map[r][c] != 'D');
	}

	private static void printMap(PrintWriter out) {
        for(char[] arr : map) 
            out.println(arr);
    }
}

class Node {
	int r;
	int c;
	int count;

	public Node(int r, int c) {
		this.r = r;
		this.c = c;
		this.count = 0;
	}

	public Node(int r, int c, int count) {
		this.r = r;
		this.c = c;
		this.count = count;
	}

	public boolean equals(Object o) {
		Node n = (Node) o;
		return n.r == r && n.c == c;
	}
}
