package lab1.task5;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Task 5: 'The transpose of a NxM matrix'");

        final Matrix mat = new Matrix(3, 2);

        mat.random(1, 9);

        mat.printMatrix();

        mat.transposition().printMatrix();
    }
}

