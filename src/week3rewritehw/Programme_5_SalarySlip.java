package week3rewritehw;

import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF

 */
public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //scanner declaration for reading a input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  your name ");
        String name=scanner.nextLine();

        System.out.println("Enter your Employee ID");
        int employeeId=scanner.nextInt();

        System.out.println("Enter basic salary");
        double basicSalary=scanner.nextDouble();
        //calculating a HR,DA,TA,PF
        double hRA=calculateHra(basicSalary);
        double da=calculateDa(basicSalary);
        double ta=calculateTa(basicSalary);
        double pf=calculatePf(basicSalary);

        // Calculating the gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }
    //calculating HRA
    public static double calculateHra(double basicSalary){
       return (basicSalary*10)/100;
    }
    //calculating DA
    public static double calculateDa(double basicSalary){
        return (basicSalary*8)/100;
    }
    //calculating TA
    public static double calculateTa(double basicSalary){
        return (basicSalary*9)/100;
    }
    public static double calculatePf(double basicSalary){
        return (basicSalary*20)/100;
    }
}
