import java.io.BufferedReader;
import java.io.InputStreamReader;

public class guess {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double n = 500;   
        boolean status = false;
        int lowest = 1001;
        int highest = 0;
        while(!status) {
            System.out.println((int) n);     
            String guess = in.readLine();
            if(guess.equals("correct"))
                status = true;
            else if(guess.equals("lower")) {
                highest = (int) n;
                if(lowest < 1001) 
                    n = lowest + Math.ceil((n - lowest) / 2);
                else 
                    n = Math.ceil(n / 2);
            }
            else {
                lowest = (int) n;
                if(highest > 0)
                    n = highest - Math.ceil((highest - n) / 2); 
                else
                    n = (n + Math.ceil(n / 2) > 1001 ? 1001 - Math.ceil((1001 - n) / 2) : n + Math.ceil(n / 2));
            }
        }
    }
}