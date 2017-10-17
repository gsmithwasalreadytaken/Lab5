package edu.luc.cs271.linkedstack;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    LinkedList<String> stack = new LinkedList<>();

    final Scanner input = new Scanner(System.in);
    String line;

    while ((line = input.nextLine()) != null){
      stack.push(line);
    }

    String response = "";

    while (!stack.isEmpty()) {
      response = response + stack.pop();
      System.out.println(response);

    }
  }
}
