//You will be given two numbers a and b.
//Print out every number from a to b (inclusive). a will always be less than b.

import java.util.Scanner;
public class Main {

  public static void doStuff(int a, int b){
    for(int num = a; num <= b; num = num + 1) {
      printNum(num);
    }
  }

  public static void printNum(int x){
    System.out.print(x + " ");
  }


  //boilerplate code
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      int b= in.nextInt();
      doStuff(a, b);
      System.out.println("");
    }
  }
}