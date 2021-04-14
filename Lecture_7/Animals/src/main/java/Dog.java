public class Dog extends Mammal {

    public Dog() {
        setCoatColor("Spotted");
        setNumberOfPaws(4);
        setNumberOfTeeth(48);
        setTail("wagging");
        setName("Жанна");
        setAge(6);
        setWeight(9);
    }

    public void bark() {
        System.out.println("Dog barks.");
    }

    @Override
    public void name() {
        System.out.println("Dog name is: " + getName());
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating food.");
    }
}
