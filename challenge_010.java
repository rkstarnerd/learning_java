//Find the factorial of a by multiplying all the numbers from 1 to a together,
//and then return the total product.

import java.util.Scanner;

public class Main {

  public static int doStuff(int a){
    int product = 1;
    for(int i=1; i<=a; i=i+1){
      product = product * i;
    }
    return product;
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