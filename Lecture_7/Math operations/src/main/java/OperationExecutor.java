public class OperationExecutor {

    void execute(MathOperations[] operations, double a, double b) {
        if (operations.length > 0) {
            for (MathOperations operation : operations) {
                System.out.println(operation.getClass().getName() + " " + operation.compute(a, b));
            }
        }
    }
}
