package Exercise01;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(100);
        BankAccount b2 = new BankAccount(50);
        BankAccount b3 = new BankAccount(500);
        BankAccount b4 = new BankAccount(1000);

        System.out.println("Initial value of BankAccount: " + b1.getBalance());
        b1.deposit(100);
        System.out.println("After depositing 100");
        System.out.println(b1.getBalance());
        System.out.println("After withdrawing 150");
        b1.withdraw(150);
        System.out.println(b1.getBalance());

        System.out.println(b1.getId());
        System.out.println(b2.getId());
        System.out.println(b3.getId());
        System.out.println(b4.getId());



    }
}
