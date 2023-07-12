package Basics;

import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income");
        double income = sc.nextDouble();
        double tax;
        if(income<500000){
            tax= 0;
            System.out.println("You can get 0% of tax ");
        }
        if(income>500000 && income<1000000){
            tax= 0.2;
            System.out.println("Your are applicable to the 20% tax");
            System.out.println("hence the "+ (income*tax) + "will be amount deducted");
        }
        else{
            tax=0.3;
            System.out.println("Your are applicable to the 30% tax");
            System.out.println("hence the "+ (income*tax) + " will be amount deducted");
        }
    }

}