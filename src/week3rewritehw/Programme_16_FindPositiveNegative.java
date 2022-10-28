package week3rewritehw;

import java.util.Scanner;

/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”

 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration for reading inpurt from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //cosing the scanner
        scanner.close();

    }
    //finding the number is negative,positive or zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if(number>0){
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }
}
