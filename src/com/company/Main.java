package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("WELCOME TO CHARITY FOUNDATION BANK \n");
        System.out.print("-------------------------------------- \n");

        System.out.print("        PLEASE ENTER YOUR NAME \n");
        String name = sc.nextLine();
        System.out.print("-------------------------------------- \n");

        System.out.print("        PLEASE ENTER YOUR ID \n");
        int id = sc.nextInt();
        System.out.print("-------------------------------------- \n");

        BankAccount ba = new BankAccount(name,id);
        ba.showMenu();


    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    int customerId;

    BankAccount (String cname , int cid)
    {
        customerName = cname;
        customerId = cid;

    }
    void deposit (int amount)
    {
        if (amount != 0)
        {
            balance = balance +amount ;
            previousTransaction = amount ;
            System.out.println("Your new balance is : "+ balance);

        }

    }
    void withdraw (int amount)
    {
        if (amount != 0)
        {
            balance = balance -amount ;
            previousTransaction = -amount ;
            System.out.println("Your new balance is : "+ balance);

        }
    }
    void getPrevoiusTransaction ()
    {
        if (previousTransaction > 0 )
        {
            System.out.println("deposited : "+ previousTransaction);

        }
        else if (previousTransaction<0)
        {
            System.out.println("Withdrawn : "+ Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction ");
        }
    }
    void showMenu ()

    {
        char option = '\0';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome : " + customerName);
        System.out.println("your ID is  : "+customerId);
        System.out.println("\n");
        System.out.println("A. CHECK BALANCE .");
        System.out.println("B. DEPOSIT .");
        System.out.println("C. WITHDRAW .");
        System.out.println("D. PREVIOUS TRANSACTION .");
        System.out.println("E. EXIT .");


        do {

            System.out.println("=======================================================================================");
            System.out.println("choose an option from the list ...");
            System.out.println("=======================================================================================");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch (option)

            {
                case 'A':
                    System.out.println("----------------------------");
                    System.out.println("Your Balance is : $"+ balance);
                    System.out.println("----------------------------");
                    break;

                case 'B':
                    System.out.println("----------------------------");
                    System.out.println("ENTER THE AMOUNT YOU WANT TO deposit");
                    System.out.println("----------------------------");
                    int amount1 = scan.nextInt();
                    deposit(amount1);
                    break;


                case 'C':
                    System.out.println("----------------------------");
                    System.out.println("ENTER THE AMOUNT YOU WANT TO withdraw");
                    System.out.println("----------------------------");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    break;

                case 'D':
                    System.out.println("----------------------------");
                    System.out.println("Your prevois transcation amount is : $"  + previousTransaction);
                    System.out.println("----------------------------");
                    getPrevoiusTransaction();
                    break;

                case 'E':
                    System.out.println("----------------------------");
                    System.out.println("THANK YOU");
                    System.out.println("----------------------------");
                     break;

                default:
                    System.out.println("Invalid option please enter again !!!");
                    break;

            }







        }while (option != 'E');
        System.out.println("Thanks for using our services today");




    }
}

