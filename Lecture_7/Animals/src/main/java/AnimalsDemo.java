public class AnimalsDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name();
        dog.bark();
        dog.eat();
        dog.sleep();
        System.out.println("Dog color: " + dog.getCoatColor() + "\nTail: " + dog.getTail() +
                "\nNumber of teeth: " + dog.getNumberOfTeeth() + "\nNumber of paws: " + dog.getNumberOfPaws() + "\n");

        Rat rat = new Rat();
        rat.name();
        rat.genus();
        rat.eat();
        rat.sleep();
        System.out.println("Rat color: " + rat.getCoatColor() + "\nTail: " + rat.getTail() +
                "\nNumber of teeth: " + rat.getNumberOfTeeth() + "\nNumber of paws: " + rat.getNumberOfPaws() + "\n");

        Parrot parrot = new Parrot();
        parrot.name();
        parrot.eat();
        parrot.sleep();
        parrot.emittedBySound();
        System.out.println("Plumage color: " + parrot.getPlumageColor() + "\nBeakType: " + parrot.getBeakType() +
                "\nFlight speed: " + parrot.getFlightSpeed() + "km/h");

    }

}
