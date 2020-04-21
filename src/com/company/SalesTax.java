package com.company;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        //Creat a Scanner object
        Scanner input =new Scanner(System.in);

        //Prompt the user to enter purchase amount
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        //Computer tax
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100)/100.0);
    }
}
