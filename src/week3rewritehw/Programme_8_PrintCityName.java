package week3rewritehw;

import java.util.Scanner;

/* Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
         * any other alphabet should be invalid entry

  */
public class Programme_8_PrintCityName {
     public static void main(String[] args) {
         //scanner declaration for reading input from console
         Scanner scanner=new Scanner(System.in);
         System.out.println("Please enter any alphabet between A to F");
         char city=scanner.next().charAt(0);
         //object creation
         Programme_8_PrintCityName programme_8_printCityName=new Programme_8_PrintCityName();
         programme_8_printCityName.printCityName(city);
         //closing the scanner
         scanner.close();
     }
     //printing a city name
    public static void printCityName(char city){
         if(city=='A'||city=='a'){
             System.out.println("Aberdeen");
        }else if (city=='B'||city=='b'){
             System.out.println("Belfast");
         } else if (city=='C'||city=='c') {
             System.out.println("Cambridge");
         } else if (city=='D'||city=='d') {
             System.out.println("Derby");
         }else if (city=='E'||city=='e') {
             System.out.println("Edinburg");
         } else if (city=='F'||city=='f') {
             System.out.println("Feltham");
         }else {
             System.out.println("The alphabet you enter is not between A to F");
         }

         }

}
