package Exercise01;

public class BankAccount {

    private double balance;
    private int Id;
    private static int lastAssignedNumber = 1000;


    public BankAccount(double balance){
        this.balance = balance;
        lastAssignedNumber++;
        Id = lastAssignedNumber;

    }

    /**
     * Deposits money into the account
     * @param amount must be >0
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Withdraws money from the account
     * @param amount must be >0
     */
    public void withdraw(double amount){
        balance -= amount;
    }

    /**
     * Shows the current amount of money in the account
     * @return
     */
    public double getBalance(){
        return balance;
    }

    public int getId(){
        return Id;
    }
}
