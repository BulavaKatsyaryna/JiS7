public class WhileOddChecker {

    public static void main(String args[]) {
        int x = 50;
        int i = 0;
        while (i < x) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x--;
        }
    }
}
