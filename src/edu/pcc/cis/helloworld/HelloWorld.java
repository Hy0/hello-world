package edu.pcc.cis.helloworld;
import java.util.Scanner;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(new Date());
    }
}
