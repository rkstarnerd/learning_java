//You will be given two integers a and b.
//Return true if a is a multiple of b, and false otherwise.

import java.util.Scanner;

public class Main {

  public static boolean doStuff(int a, int b){
    if ((a % 3) == 0) {
      return true;
    }
    else {
      return false;
    }
  }


  //boilerplate code
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      int b= in.nextInt();
      boolean result = doStuff(a, b);
      System.out.println(result);
    }
  }
}
