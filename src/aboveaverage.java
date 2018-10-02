/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Jul 12 18
 */

import java.util.Scanner;

public class aboveaverage {
  public static void main(String[] args) {
  	Scanner in  = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i < n; i++) {
      int students = in.nextInt();
      double[] scores = new double[students];
      double average = 0;
      double count = 0;
      for(int z = 0; z < students; z++) {
        double score = in.nextDouble();
        scores[z] = score;
        average += score;
      }
      average = average / students;
      for(int b = 0; b < students; b++) {
        if(scores[b] > average) {
          count++;
        }
      }
      double percent = count / students * 100;
      System.out.printf("%.3f", percent);
      System.out.print("%");
      System.out.println();
    }
  }
}
