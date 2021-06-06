/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 1 - Saying Hello
 *  Create a program that prompts for your name and prints a greeting
 *  using your name
 *
 *  Constraint:
 *  Keep the input, string concatenation, and output separate.

 */

package ex01;
import java.util.Scanner;

public class base {

    public static void main(String [] args){
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        String name;
        String concat;

        // User name input
        System.out.printf("What is your name? ");
        name = userInput.nextLine();

        // String concatenation
        concat = "Hello, " + name + ", nice to meet you!";

        System.out.printf("%s", concat);

        return;
    }
}
