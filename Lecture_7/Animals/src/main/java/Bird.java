public abstract class Bird extends Animal {
    private String plumageColor;
    private String beakType;
    private Integer flightSpeed;

    public Bird() {
    }

    public Bird(Integer age, String name, Integer weight) {
        super(age, name, weight);
    }

    public String getPlumageColor() {
        return plumageColor;
    }

    public void setPlumageColor(String plumageColor) {
        this.plumageColor = plumageColor;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    public Integer getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(Integer flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public abstract void name();
}
