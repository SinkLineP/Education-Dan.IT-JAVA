package testOne.Artem;

import java.util.Scanner;

public class tictactoe {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] cell = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int i;

    do {
      for (i = 0; i < cell.length; i++) {
        System.out.printf("%s | %s | %s \n", cell[i], cell[i+1], cell[i+2]);
      }

      /*System.out.printf("%d | %d | %d \n", cell, cell, cell);
      System.out.printf("%d | %d | %d \n", cell, cell, cell);
      System.out.printf("%d | %d | %d \n", cell, cell, cell);*/

      System.out.print("Enter cell '1-9': ");
      int cells = input.nextInt();
    } while(true);
  }
}
