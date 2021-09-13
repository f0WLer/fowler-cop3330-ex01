import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.println(greeting);
    }
}