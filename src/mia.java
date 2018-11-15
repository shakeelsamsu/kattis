import java.io.*;
import java.util.*;
import java.math.*;

public class mia {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            String line = in.readLine();
            if(line.equals("0 0 0 0")) break;
            String[] input = line.split(" ");
            int[] player1 = new int[2];
            int[] player2 = new int[2];
            for(int i = 0; i < 2; i++) player1[i] = Integer.parseInt(input[i]);
            for(int i = 2; i < 4; i++) player2[i - 2] = Integer.parseInt(input[i]);
            String player1Max = Integer.toString(Math.max(player1[0], player1[1])) + Integer.toString(Math.min(player1[0], player1[1]));
            String player2Max = Integer.toString(Math.max(player2[0], player2[1])) + Integer.toString(Math.min(player2[0], player2[1]));
            boolean player1Double = player1Max.substring(0, 1).equals(player1Max.substring(1));
            boolean player2Double = player2Max.substring(0, 1).equals(player2Max.substring(1));
            if(player1Max.equals(player2Max)) out.println("Tie.");
            else if (player1Max.equals("21") || player2Max.equals("21")) {
                if(player1Max.equals("21")) out.println("Player 1 wins.");
                else out.println("Player 2 wins.");
            }
            else if(player1Double || player2Double) {
                if(player1Double && player2Double) {
                    if(Integer.parseInt(player1Max) > Integer.parseInt(player2Max)) out.println("Player 1 wins.");
                    else out.println("Player 2 wins.");
                }
                else if(player1Double) out.println("Player 1 wins.");
                else out.println("Player 2 wins.");
            }
            else {
                if(Integer.parseInt(player1Max) > Integer.parseInt(player2Max)) out.println("Player 1 wins.");
                else out.println("Player 2 wins.");
            }
        }
        out.close();
    }
}
