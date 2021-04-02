import java.util.Scanner;

public class SignComparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

            if (!sc.hasNextInt()) {
            } else {
                int n = sc.nextInt();
                while (n == 0) {
                    System.out.println("Number is equal to zero");
                    break;
                }
                while (n > 0) {
                    System.out.println("Number is positive");
                    break;
                }
                while (n < 0) {
                    System.out.println("Number is negative");
                    break;
                }
            }
        }
    }