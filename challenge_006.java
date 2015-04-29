//Given two numbers a and b,
//return the remainder when their product is divided by their sum.

import java.util.Scanner;

public class Main {

  public static int doStuff(int a, int b){
    int sum = a + b;
    int product = a * b;
    return product % sum;
  }


  //boilerplate code
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      int b= in.nextInt();
      int result = doStuff(a, b);
      System.out.println(result);
    }
  }
}