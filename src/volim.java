import java.util.Scanner;

class volim {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int player = in.nextInt();
    int questions = in.nextInt();
    int time = 0; 
    for(int i = 0; i < questions; i++) {
      time += in.nextInt();
      if(time > 210) break;
      String outcome = in.next();
      if(outcome.equals("T")) {
        if(player < 8) {
          player++;
        }
        else {
          player = 1;
        }
      }
    }
    System.out.println(player);
  }
}

