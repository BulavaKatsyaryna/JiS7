public class Parrot extends Bird{

    public Parrot() {
        setPlumageColor("Multicolored");
        setBeakType("Granivorous");
        setFlightSpeed(120);
        setName("Антоха");
        setWeight(2);
        setAge(5);
    }

    public void emittedBySound() {
        System.out.println("The parrot speaks like a person.");
    }

    @Override
    public void name() {
        System.out.println("Parrot name is: " + getName());
    }

    @Override
    public void sleep() {
        System.out.println("The parrot sleeps when the cage is covered.");
    }
}
