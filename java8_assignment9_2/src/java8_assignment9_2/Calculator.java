package java8_assignment9_2;

public class Calculator {
    public static void main(String[] args) {
        MathOperation addition = MathOperation.add();
        MathOperation subtraction = MathOperation.subtract();
        MathOperation multiplication = MathOperation.multiply();
        MathOperation division = MathOperation.divide();

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        System.out.println("Division: " + division.operate(5, 3));
    }
}
