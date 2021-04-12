public class CreditCardDemo {

    public static void main(String[] args) throws Exception {

        CreditCard creditCard = new CreditCard();

        creditCard.balance = 0;
        creditCard.creditLimit = -1000;
        creditCard.loanDebt = 0;

        System.out.println("Balance = " + creditCard.balance);

        creditCard.deposit(150, 4321, 987654321); {
            System.out.println("Зачисление средств на карту. Balance = " + creditCard.balance);
        }

        creditCard.withdraw(1100, 4321, 987654321); {
            System.out.println("Снятие средств с карты. Balance = " + creditCard.balance);
        }
    }
}



