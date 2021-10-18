/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Program_7 {

    public static void main(String[] args) {

        int salesid, salary;
        double salesamt, commission;
        String sellername;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        salesid = sc.nextInt();

        System.out.print("Enter Seller name: ");
        sellername = sc.next();

        System.out.print("Enter sales amount: ");
        salesamt = sc.nextDouble();

        System.out.print("Enter employee Salary: ");
        salary = sc.nextInt();
        sc.close();

        // If statement to find the commission
        if (salesamt >=50000){
            System.out.println("Sales commison is: " + (commission = salesamt*0.35));
        }else if (salesamt>=30000 && salesamt<50000){
            System.out.println("Sales commision is: " + (commission=salesamt * 0.20));
        }else if (salesamt>=20000 && salesamt<30000){
            System.out.println("Sales commission is " + (commission=salesamt*0.10));
        }else if (salesamt>=10000 && salesamt<20000){
            System.out.println("Sales commission is " +(commission=salesamt*0.05));
        }else if (salesamt<10000){
            System.out.println("sales commisson is: "+(commission=salesamt*0.02));
        }

    }

}
