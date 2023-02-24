package quizzes;

import java.util.Scanner;

public class LowercaseToCapitalized {
    public static void main(String[] args) {
        System.out.println("enter a capitalized letter");
        Scanner scr = new Scanner(System.in);
        String temp = scr.next();
        char ch = temp.charAt(0);

        char capitalized = ('a'<=ch&&ch<='z')?(char)(ch-32):ch;

        System.out.println("you entered "+temp);
        System.out.println("retrieved "+ch);
        System.out.println("converted "+ch+" to "+capitalized);
    }
}
