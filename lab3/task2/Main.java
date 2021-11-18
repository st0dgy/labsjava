package lab3.task2;

public class Main {
    public static void main(String[] args) {
        try (Example example = new Example()) {
            example.read();
        } catch (Exception e) {
            System.out.println("caught IOException");
        }
    }
}
