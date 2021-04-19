public abstract class Mammal extends Animal {
    private String coatColor;
    private Integer numberOfPaws;
    private Integer numberOfTeeth;
    private String tail;

    public Mammal() {
    }

    public Mammal(Integer age, String name, Integer weight) {
        super(age, name, weight);
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public Integer getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(Integer numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public Integer getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(Integer numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public abstract void name();
}
