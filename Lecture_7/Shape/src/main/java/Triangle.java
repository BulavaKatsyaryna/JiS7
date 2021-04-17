class Triangle extends AbstractShape{
    int cathetus1;
    int cathetus2;

    Triangle (int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    @Override
    public String getName() {
        return "Треугольник";
    }

    @Override
    public double getArea() {
        return ((cathetus1 * cathetus2) / 2.0);
    }

    @Override
    void checkData(double catetus1) {
    }

}
