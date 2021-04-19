package Lecture_5_6.Encoder;

public class EncoderDemo {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        encoder.believe = 9996;
        encoder.victory = '✊';

        System.out.println("Character to code: " + (short) encoder.victory);
        System.out.println("Code to character : " + (char) encoder.believe);
    }
}
