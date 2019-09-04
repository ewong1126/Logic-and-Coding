/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int b;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Please enter your birth month as numbers");  //prompt the user for a birth month
        b = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (b < 1 || b > 12) {
            System.out.println ("Not a month.") ;
        }
        else if (b == 9 || b == 11){
            System.out.println("There are 30 days.");
        }
        else if (b == 1){ 
            System.out.println ("There are 31 days.");
        }
        else if (b % 2 == 0 || b != 2 || b!= 8 || b!= 10 || b != 12) {
            System.out.println ("There are 30 days.");
        }
        else if (b % 2 == 1 || b == 8 || b ==10 || b == 12) {
            System.out.println ("There are 31 days.");
        }
        else if(b == 2) {
            System.out.println ("There are 28 days.");
        }
    }
}