public class ShapeDemo {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 8);
        Circle circle = new Circle(6);
        Square square = new Square(12);
        Shape[] shapes = {triangle, circle, square};

        System.out.println("Расчёт площади фигур:");
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ": " + shape.getArea());
        }
    }
}


