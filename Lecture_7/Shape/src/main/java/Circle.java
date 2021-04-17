class Circle extends AbstractShape{
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return ((radius * radius) * 3.14);
    }

    @Override
    void checkData(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус не может быть равен или меньше нуля!");
        }
    }
}
