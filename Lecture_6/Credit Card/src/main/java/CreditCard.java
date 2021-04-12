public class CreditCard {

    public int pin;
    public int balance;
    public int creditLimit;
    public int loanDebt;

    public CreditCard(int cardNumber, int pin){
        cardNumber = cardNumber;
    }

    public int deposit(int amount, int pin){
        this.balance += amount;
        return this.balance;
    }
    public int withdraw(int amount, int pin){
        this.balance -= amount;
        return this.balance;
    }
}
