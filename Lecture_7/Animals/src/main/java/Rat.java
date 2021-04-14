public class Rat extends Mammal {

    public Rat() {
        setCoatColor("White");
        setNumberOfPaws(4);
        setNumberOfTeeth(16);
        setTail("Covered along the entire length with small hairs. The rat always balances its tail");
        setAge(1);
        setName("Жора");
        setWeight(1);
    }

    @Override
    public void name() {
        System.out.println("Rat name is: " + getName());
    }

    public void genus() {
        System.out.println("Rats belong to the mouse family.");
    }

    @Override
    public void eat() {
        System.out.println("Rats are omnivorous.");
    }
}
