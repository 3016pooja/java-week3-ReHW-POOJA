package week3rewritehw;
/* *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?*/

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //scanner declartion for reading an input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=scanner.nextInt();
        Programme_2_LeapYear programme_2_leapYear=new Programme_2_LeapYear();
        programme_2_leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();
    }
    //checking is it a leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

        System.out.println("The"+ year+"is"+ "leap year " );
        return;
    }
    System.out.println("The"+ year + "is not leap year ");
    }
    }
