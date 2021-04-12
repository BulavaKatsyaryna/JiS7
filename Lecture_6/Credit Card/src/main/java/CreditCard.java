public class CreditCard {

    public int balance;
    public int creditLimit;
    public int loanDebt;

    public int deposit(int amount, int pin, int cardNumber) throws Exception {
        if (pin != 4321 || cardNumber != 987654321)
            throw new Exception("Ошибка! Неверное введен номер карты или пин код!");
        this.balance += amount;
        return this.balance;

    }
    public int withdraw(int amount, int pin, int cardNumber) throws Exception{
        if (pin != 4321 || cardNumber != 987654321)
            throw new Exception("Ошибка! Неверное введен номер карты или пин код!");
        this.balance -= amount;
        return this.balance;
    }
}
