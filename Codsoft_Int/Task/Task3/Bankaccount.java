public class Bankaccount{

    private static int balance;

    public Bankaccount(int balance) {
        this.balance = balance;
    }

    public static void withdraw(int amount){
        if (balance < amount){
        }
        balance -= amount;
    }

    public static void deposit(int amount){
        balance += amount;

    }

    public int getbalance(){
        return balance;

    }

}