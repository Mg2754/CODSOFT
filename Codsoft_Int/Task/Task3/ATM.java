

import java.util.Scanner;


public class ATM{

    public Bankaccount bankaccount;

    public ATM(Bankaccount bankaccount){
        this.bankaccount = bankaccount;

    }

    public void withdraw(){
        System.out.print("Enter the amount you need to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

       Bankaccount.withdraw(amount);
       withdraw(amount);
    }

    public void deposit(){
        System.out.print("Enter the amount you need to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        Bankaccount.deposit(amount);;
        deposit(amount);
    }

    private void withdraw(int amount){
        if(bankaccount.getbalance() < amount ){
            System.out.println("Insuffecient Funds");

        }
        else
            System.out.println("Amount withdrawed sucessfully " + amount);

    }

    private void deposit(int amount){
        System.out.println("Amount deposited sucessfully "+amount);
    }

    private void checkBalance(){
        System.out.println("Your account blace: "+bankaccount.getbalance());
    }


    public static void main(String[] args){
        Bankaccount bankaccount = new Bankaccount(1000);
        ATM atm = new ATM(bankaccount);

        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ATM Menu");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");

            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    atm.withdraw();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }while(choice != 4);
        sc.close();

    }



}