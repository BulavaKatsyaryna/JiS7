public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i == (i/2) * 2) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}