//You will be given two integer inputs, a and b.
//Simulate a NAND gate by returning a boolean false only if both inputs are equal to 1,
//and returning true in all other cases.

import java.util.Scanner;

public class Main {

  public static boolean doStuff(int a, int b){
    if((a == 1) && (b == 1)) {
      return false;
    }
    else {
      return true;
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
