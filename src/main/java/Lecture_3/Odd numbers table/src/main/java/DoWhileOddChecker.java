public class DoWhileOddChecker {
//***********************Checked***********************
    public static void main(String args[]) {
        int i=0;
        do {
            i++;
            if(i % 2==1) // Or i % 2 != 0 (the same)
                System.out.println(i);
        } while (i < 50);
    }
}
