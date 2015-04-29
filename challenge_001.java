//You are given two variables a and b as input.
//Can you return the sum of a and b?

import java.util.Scanner;

public class Main {
  public static int add(int a, int b){
    return a + b;  // solution
  }

  //boilerplate code
  public static void main(String[] args) {
    Scanner in = Scanner(System.in);

    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int result = add(a, b);
      System.out.println(result);
    }
  }
}
