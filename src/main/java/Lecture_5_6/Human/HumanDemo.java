package Lecture_5_6.Human;

public class HumanDemo {

    public static void main(String[] args) {
        Human people = new Human();

        people.name = "Katya";
        people.age = 26;

        System.out.println("Hi! My name is " + people.name);
        System.out.println("I'm " + people.age + " years old");
    }
}
