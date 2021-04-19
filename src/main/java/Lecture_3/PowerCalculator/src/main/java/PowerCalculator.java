package Lecture_3.PowerCalculator.src.main.java;

import java.util.Scanner;
//***********************Checked***********************
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A и B");
        double base = sc.nextDouble();
        double power = sc.nextDouble();

        System.out.println("Ответ: " + (int)Math.pow(base, power));
        sc.close();// Oyyyyy myyyyy))) good joob)
    }
}

