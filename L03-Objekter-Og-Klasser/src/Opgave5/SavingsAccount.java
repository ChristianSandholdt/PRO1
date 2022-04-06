package Opgave5;

public class SavingsAccount {

    public double interest;
    public double balance;

    public SavingsAccount(int balance, double interest){
        this.balance = balance;
        this.interest = interest;
    }
    public double addInterest(){
        balance = balance*interest;

        return balance;
    }

    public static void main(String[] args) {
        SavingsAccount opsparing = new SavingsAccount(1000,1.1);

        System.out.println(opsparing.addInterest());
    }

}
