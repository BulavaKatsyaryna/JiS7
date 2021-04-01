public class DoWhileOddChecker {

    public static void main(String args[]) {
        int i=0;
        do {
            i++;
            if(i % 2==1)
                System.out.println(i);
        } while (i < 50);
    }
}
