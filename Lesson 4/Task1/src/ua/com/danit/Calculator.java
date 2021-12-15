package ua.com.danit;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int OneNumber;
    int TwoNumber;
    String Operator;
    int output;

    while (true) {
      System.out.print("Enter one Number: ");
      OneNumber = input.nextInt();

      System.out.print("Enter two Number: ");
      TwoNumber = input.nextInt();

      System.out.print("Enter Operator: ");
      Operator = input.next();

      switch (Operator) {
        case "+":
          output = OneNumber + TwoNumber;
          System.out.println(OneNumber + " " + Operator + " " + TwoNumber + " = " + output);
          break;
        case "-":
          output = OneNumber - TwoNumber;
          System.out.println(OneNumber + " " + Operator + " " + TwoNumber + " = " + output);
          break;
        case "/":
          output = OneNumber / TwoNumber;
          System.out.println(OneNumber + " " + Operator + " " + TwoNumber + " = " + output);
          break;
        case "*":
          output = OneNumber * TwoNumber;
          System.out.println(OneNumber + " " + Operator + " " + TwoNumber + " = " + output);
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + Operator);
      }
      System.out.println();
    }
  }
}
