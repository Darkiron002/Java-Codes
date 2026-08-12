/**
 * BankingSystem
 */

import java.util.Scanner;

public class BankingSystem {

    public static double balance;
    public static String name = "Chayan";

    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);

        //Variables 
        int choice;
        System.out.print("Enter the initial balance: ");
        balance = sc.nextDouble();

       do {
             System.out.println("***************");
        System.out.println("Banking system ");
        System.out.println("***************");

        

        System.out.println(" 1. Account holder details");
        System.out.println("2. Show current Balance");
        System.out.println("3. Deposit money");
        System.out.println("4. Money withdrawl");
        System.out.println("5. Exit the program");
        System.out.println("Enter your choice ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                ShowName(name, balance);
                break;
            case 2:
                ShowBalance();
                break;
            case 3:
                System.out.print("How much would you like to deposit? ");
                double dep = sc.nextDouble();
                Deposit(dep);
                break;
            case 4:
                System.out.print("How much would you like to withdraw? ");
                double wit = sc.nextDouble();
                Withdrawl(wit);
                break;
            case 5:
                System.out.println("You exited the program");
                break;
            default:
                System.out.println("You chose the wrong option!!!!");
                break;
        }

        
       } while (choice !=5);

    }
    //show Account Holder Detail
    static void ShowName(String name,double money ){
        System.out.println("The Account holder name is "+name);
        System.out.println("The Account holder ballence is "+money);
    }

    //Show balance method
    static void ShowBalance(){
        System.out.println("Your current Balance is "+ balance );
    }

    //Deposit money method
    static void Deposit(double money){
        balance += money;
        System.out.println("Your balance after deposit "+ balance);
    }

    //Withdrawl money method 
    static void Withdrawl(double money){
        balance -= money;
        System.out.println("Your balance after withdrawl is "+balance);
    }




}