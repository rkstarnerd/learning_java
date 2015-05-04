//Given a name as input, print a message "Hello [name]!" on its own line.

import java.util.Scanner;

public class Main {
  public static void doStuff(String name){
    System.out.println("Hello " + name + "!");
  }

  //boilerplate code
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=0; i<n; i++){
      String name = in.next();
      doStuff(name);
    }
  }
}