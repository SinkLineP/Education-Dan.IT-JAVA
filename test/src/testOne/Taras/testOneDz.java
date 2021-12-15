package testOne.Taras;

import java.util.Arrays;
import java.util.Scanner;


public class testOneDz {
  public static void main(String [] args) {
    System.out.println("Let the game begin!");
    String n = "Please enter name: ";
    for (int i = 0; i < 1; i++) {
      try {
        Thread.sleep(1000);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
      System.out.print(n);
    }

    Scanner scannerStr = new Scanner(System.in);
    String name = scannerStr.nextLine();

    int UnknownNumber;
    int UserNumber;
    int TrysCount = 0;
    int[] arrayNumber;


    Scanner input = new Scanner(System.in);
    System.out.println(Arrays.toString(new String[]{name}) + " YOUR TASK: Guess the number (from 0 to 100).");
    UnknownNumber = (int)Math.floor(Math.random() * 100);

    /*while (UserNumber != UnknownNumber) {
      TrysCount = TrysCount + 1;
      arrayNumber = new int[TrysCount];

      for (int i = 0; i < TrysCount; i++) {
        System.out.print("Enter pleas number: ");
        while (!input.hasNextInt()) {
          System.out.print("not a number or a number 0 or less, enter again:");
          input.next();
        }

        UserNumber = input.nextInt();
        arrayNumber[i] = UserNumber;

        if (UserNumber > UnknownNumber) {
          System.out.println("My number is less.");
        } else if (UserNumber < UnknownNumber) {
          System.out.println("My number is higher.");
        } else {
          System.out.println("YOU WIN!)" + Arrays.toString(new String[]{name}));
        }
        System.out.println("Number of attempts:" + TrysCount);
        System.out.println("My Array = " + Arrays.toString(arrayNumber));
      }


    }
*/

    arrayNumber = new int[100];

    do {
      TrysCount++;
      System.out.print("Enter pleas number: ");
      while (!input.hasNextInt()){
        System.out.print("not a number or a number 0 or less, enter again:");
      input.next();
      }

      UserNumber = input.nextInt();
      arrayNumber[TrysCount - 1] = UserNumber;

      System.out.println("Array number: " + Arrays.toString(arrayNumber));

      if (UserNumber > UnknownNumber){
        System.out.println("My number is less.");
      }else if(UserNumber < UnknownNumber){
        System.out.println("My number is higher.");
      }else {
        System.out.println("YOU WIN!)" + Arrays.toString(new String[]{name}));
      }
    }while (UserNumber != UnknownNumber);

    System.out.println("Number of attempts:" + TrysCount);
    System.out.println("You array: " + Arrays.toString(arrayNumber));
  }
}
