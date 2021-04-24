package Lecture_7.MathOperations;

public class MathOperationDemo {

    public static void main(String[] args) {

        OperationExecutor executor = new OperationExecutor();
        AdditionOperation additionOperation = new AdditionOperation();
        SubtractionOperation subtractionOperation = new SubtractionOperation();
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
        DivisionOperation divisionOperation = new DivisionOperation();

        MathOperations[] mathOperations = {additionOperation, subtractionOperation, multiplicationOperation, divisionOperation};

        executor.execute(mathOperations, 56.7, 94);
    }
}
