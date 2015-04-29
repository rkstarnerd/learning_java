//You will be given one number a as input.
//If a is even, return half of a (a / 2). If a is odd, return 3 * a + 1.

import java.util.Scanner;

public class Main {

  public static int doStuff(int a){
      if (a % 2 == 0) {
        return a / 2;
      }
      else {
        return 3 * a + 1;
      }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      int result = doStuff(a);
      System.out.println(result);
    }
  }
}