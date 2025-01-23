package org.example.Uy;

public interface MathOperations{
    default int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
class Calculator implements MathOperations {
    @Override
    public int add(int a, int b) {
        System.out.println("Overridden add method.");
        return a + b + 1; // Example of overriding
    }
}
