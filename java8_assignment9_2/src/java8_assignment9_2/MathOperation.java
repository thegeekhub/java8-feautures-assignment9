package java8_assignment9_2;

public interface MathOperation {
    double operate(double operand1, double operand2);

    static MathOperation add() {
        return (operand1, operand2) -> operand1 + operand2;
    }

    static MathOperation subtract() {
        return (operand1, operand2) -> operand1 - operand2;
    }

    static MathOperation multiply() {
        return (operand1, operand2) -> operand1 * operand2;
    }

    static MathOperation divide() {
        return (operand1, operand2) -> operand1 / operand2;
    }
}

