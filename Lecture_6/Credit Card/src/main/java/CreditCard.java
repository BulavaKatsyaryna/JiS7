public class CreditCard {

    public int pin;
    public int balance;
    public int creditLimit;
    public int loanDebt;

    public CreditCard(int cardNumber, int pin){
        cardNumber = cardNumber;
    }

    public int deposit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int withdraw(int amount){
        this.balance -= amount;
        return this.balance;
    }
    public boolean setPin() {
        return true;
    }
}
