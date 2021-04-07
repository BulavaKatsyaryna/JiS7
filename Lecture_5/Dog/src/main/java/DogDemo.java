public class DogDemo {

    public static void main(String[] args) {
        Dog favoriteDog = new Dog();

        favoriteDog.breed = "Jack Russell Terrier ";
        favoriteDog.age = 6;
        favoriteDog.color = "black and tan with spots ";
        favoriteDog.name = "Zhanna";

        System.out.println("Hey! My name is " + favoriteDog.name);
        System.out.println("My breed is " + favoriteDog.breed);
        System.out.println("I'm " + favoriteDog.age + " years old");
        System.out.println("Color is " + favoriteDog.color);

        favoriteDog.voiceOn();
        favoriteDog.eatOff();
        favoriteDog.sleepOff();

        System.out.println("Is the dog giving voice now? " + favoriteDog.voiceOn);
        System.out.println("Is the dog eating now? " + favoriteDog.eatOn);
        System.out.println("Is the dog sleeping now? " + favoriteDog.sleepOn);
    }

}
