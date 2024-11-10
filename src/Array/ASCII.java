package Array;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter character:");
    	char character=sc.next().charAt(0);
       // char character = 'A'; // Replace 'A' with the desired character

        int asciiValue = (int) character;

        System.out.println("ASCII value of " + character + " is: " + asciiValue);
    }
}