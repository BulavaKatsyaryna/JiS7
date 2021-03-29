import java.util.*;
//**********@Checked***************//
public class HeadsAndTails {
    public static void main( String args[] ) {

        Random random = new Random();

        boolean value = random.nextBoolean();

        System.out.println("Value is: " + value);
    }
}

//    Второй метод:
//    public static boolean getRandomBoolean() {
//        return Math.random() < 0.5;
//    }
//    public static void main(String[] args) {
//        System.out.println(getRandomBoolean());
//    }
//}

