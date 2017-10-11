package com.company;
/*
 * Yonatan Mengesha
 * October 10,2017
 * Java BootCamp
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        //The below code creates a random object
        Random random= new Random ();
        int from=1;
        int to =100;
        int randomNumber= random.nextInt (to- from+1)+from;
        //The below code initializes the guessedNumber
        int guessedNumber=0;

        //This code prints out from and to
        System.out.printf("The number is between %d and %d.\n",from,to );

        //The below does  the do while

        do{
            System.out.println("Guess what the number is:");
            guessedNumber=scan.nextInt ();
            if(guessedNumber>randomNumber)
                System.out.println ("Your guess is too high!" );
            else if(guessedNumber<randomNumber)
                System.out.println ("Your guess is too low!" );
            else
                System.out.println ("You got it!" );


        }while(guessedNumber!=randomNumber);

    }
}
