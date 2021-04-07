public class Dog {

    public int age;
    public String color;
    public String name;
    public String breed;

    public boolean voiceOn;
    public void voiceOn() {
        this.voiceOn = true;
    }
    public void voiceOff() {
        this.voiceOn = false;
    }
    public boolean eatOn;
    public void eatOn() {
        this.eatOn = true;
    }
    public void eatOff() {
        this.eatOn = false;
    }
    public boolean sleepOn;
    public void sleepOn() {
        this.sleepOn = true;
    }
    public void sleepOff() {
        this.sleepOn = false;
    }
}
