package ua.com.danit;

import java.util.Scanner;

public class taskOne {
  private static void getNumber(Scanner input) {
    System.out.print("input one number: ");
    int one = input.nextInt();
    System.out.print("input two number: ");
    int two = input.nextInt();
  }

  private static int sum(int a, int b, Scanner input) {
    int a = getNumber(input);
    return a + b;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    getNumber(input);


    int fin = sum(one, two);
    System.out.print("Output: " + fin);
  }
}
