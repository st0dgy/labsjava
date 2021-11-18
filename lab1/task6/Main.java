package lab1.task6;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Task 6: 'Matrix multiplying'");

        try {
            final Matrix mat1 = new Matrix(3, 2);
            final Matrix mat2 = new Matrix(2, 3);

            mat1.random(1, 9);
            mat2.random(1, 9);

            mat1.printMatrix();
            mat2.printMatrix();

            mat1.multi(mat2).printMatrix();
        } catch (final IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}

