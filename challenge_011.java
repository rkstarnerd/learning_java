//You will be given an int a and a double b as input.
//You need to calculate their sum and then return a String message which says:
//"The sum is [sum here]"
//(Place the correct sum in the string instead of the brackets.)

import java.util.Scanner;

public class Main {

  public static String doStuff(int a, double b){
    double sum = a + b;
    String message = "The sum is " + sum;
    return message;
  }


  //boilerplate code
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for(int i=0; i<n; i++){
      int a = in.nextInt();
      double b= in.nextDouble();
      System.out.println(doStuff(a, b));
    }
  }
}