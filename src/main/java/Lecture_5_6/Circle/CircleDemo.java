package Lecture_5_6.Circle;

public class CircleDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.radius = 18;
        double i = circle.calculateArea();
        System.out.println("The area of the circle is: " + circle.calculateArea());
    }
}
