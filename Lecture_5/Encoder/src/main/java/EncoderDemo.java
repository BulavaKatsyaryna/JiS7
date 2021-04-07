public class EncoderDemo {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        encoder.num = 5835;
        encoder.sign = 'ᛗ';

        System.out.println("Character to code: " + (short) encoder.sign);
        System.out.println("Code to character : " + (char) encoder.num);
    }
}
