import java.util.Scanner;

public class ColorDetector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину волны: ");

        int num = sc.nextInt();

            if (num >= 380 && num <= 449){
                System.out.println("Violet");
            }else if (num >= 450 && num <= 494){
                System.out.println("Blue");
            }else if (num >= 495 && num <= 569){
                System.out.println("Green");
            }else if (num >= 570 && num <= 589){
                System.out.println("Yellow");
            }else if (num >= 590 && num <= 619){
                System.out.println("Orange");
            }else if (num >= 620 && num <= 750){
                System.out.println("Red");
            } else {
                System.out.println("Invisible Light");
            }
        sc.close();
        }
    }
