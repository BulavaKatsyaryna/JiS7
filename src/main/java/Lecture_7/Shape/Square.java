package Lecture_7.Shape;

public class Square extends AbstractShape {
    int side;

    Square (int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    void checkData(double side) {
    }
}
