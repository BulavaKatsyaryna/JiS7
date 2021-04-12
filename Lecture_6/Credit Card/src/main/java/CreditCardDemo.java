public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(987654321, 4321);

        creditCard.balance = 0;
        creditCard.creditLimit = -1000;
        creditCard.loanDebt = 0;
        creditCard.pin = 4321;

        Integer x = creditCard.pin;
        Integer y = 4321;

        System.out.println("Balance = " + creditCard.balance);

        creditCard.deposit(150, 4321);
        int compar = x.compareTo(y);
        if (creditCard.pin != 4321) {
            System.out.println("Введите правильный пин код.");
        } else if (creditCard.pin == 4321) {
            System.out.println("Зачисление средств на карту. Balance = " + creditCard.balance);
        }

        creditCard.withdraw(1100, 4321);
        if (creditCard.creditLimit > creditCard.balance && compar != 0) {
            System.out.println("Ошибка! Неправильно введен пин код, или сумма задолженности превышает кредитный лимит.");
        } else if (compar == 0) {
            System.out.println("Снятие средств с карты. Balance = " + creditCard.balance);
        }
    }
}


