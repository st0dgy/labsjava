package lab3.task1;

public class Main {
    public static void main(String[] args) throws MyException {
        Address address = new Address("Ukraine", "Uzhorod", "soviet", 14);

        User user = new User("Katya", "Solovei", 30, address);

        user.validate();

        System.out.println(user);
    }
}
