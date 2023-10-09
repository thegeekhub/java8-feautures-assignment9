package java8_assignment9_1;

public interface Shape {
    double area();

    void draw();

    default String defaultColor() {
        return "Black";
    }
}

