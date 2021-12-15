package ua.com.danit;

import java.util.ArrayList;
import java.util.List;

public class taskTwo {

  public static void main(String[] args) {
    List<Integer> even = new ArrayList<Integer>();
    List<Integer> odd = new ArrayList<Integer>();

    do {
      int randomNumber = (int) Math.ceil(Math.random() * 100);

        if (randomNumber % 2 == 0 && !even.contains(randomNumber)) {
          even.add(randomNumber);
        } else if (randomNumber % 2 != 0 && !odd.contains(randomNumber)) {
          odd.add(randomNumber);
        }

    } while (even.size() + odd.size() != 100);

    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers:  " + odd);
  }
}
