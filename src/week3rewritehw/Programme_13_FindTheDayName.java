package week3rewritehw;

import java.util.Scanner;

/*
Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

 */
public class Programme_13_FindTheDayName {
    public static void main(String[]args){
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number between 1 to 7:");
        int dat=scanner.nextInt();
        findTheDaysName(dat);
        //closng the scanner
        scanner.close();
    }
    public static void findTheDaysName(int day){
        switch ( day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuseday");
                break;
            case 3:
                System.out.println("Its wenesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its saturday");
                break;
            case 7:
                System.out.println("Its sunday");
                break;
            default:
                System.out.println("week contains 1 to 7 days:");
        }

    }
}
