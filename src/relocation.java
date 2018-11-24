import java.io.*;
import java.util.*;

public class relocation {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> companies = new ArrayList<Integer>();
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) companies.add(Integer.parseInt(st.nextToken()));
        //out.println(companies);
        for(int i = 0; i < q; i++) {
            st = new StringTokenizer(in.readLine());
            int query = Integer.parseInt(st.nextToken());
            if(query == 1) {
                int company = Integer.parseInt(st.nextToken());
                int location = Integer.parseInt(st.nextToken());
                companies.set(company - 1, location);
                //out.println(companies);
            }
            else {
                int companyA = Integer.parseInt(st.nextToken());
                int companyB = Integer.parseInt(st.nextToken());
                out.println(Math.abs(companies.get(companyA - 1) - companies.get(companyB - 1)));
            }
        }
        out.close();
    }
}