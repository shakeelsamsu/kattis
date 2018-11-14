import java.io.*;
import java.util.*;
import java.math.*;

public class houseofcards {

    private static BigInteger ONE = BigInteger.valueOf(1);
    private static BigInteger TWO = BigInteger.valueOf(2);

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        BigInteger h0 = new BigInteger(in.readLine());
        out.println(findSmallest(h0));
        out.close();
    }

    public static BigInteger countCards(BigInteger height) {
        if(height.equals(ONE)) return TWO;
        return height.multiply(TWO.add(height.multiply(TWO))).divide(TWO).add(height.subtract(ONE).multiply(ONE.add(height.subtract(ONE))).divide(TWO));
    }

    public static BigInteger findSmallest(BigInteger h0) {
        BigInteger height = h0; 
        BigInteger cards = countCards(h0);
        BigInteger i = BigInteger.valueOf(0);
        BigInteger mod = cards.mod(BigInteger.valueOf(4)); 
        while(!mod.equals(BigInteger.valueOf(0))) {
            i = i.add(BigInteger.valueOf(1));
            cards = countCards(h0.add(i));
            mod = cards.mod(BigInteger.valueOf(4)); 
        }
        height = height.add(i);
        return height;
    }
}