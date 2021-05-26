package Exercises.BankOOP;

public class BankApp {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(100.00);

        System.out.println("Before trasaction: ");
        ba1.display();
        ba1.deposit(34.65);
        ba1.withdraw(62.21);

        System.out.println("After trasaction: ");
        ba1.display();
    }
}
