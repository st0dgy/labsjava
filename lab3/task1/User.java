package lab3.task1;

public class User {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Address address;

    public User(String firstname, String lastname, int age, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public void validate(){
        if(!firstname.matches("^[a-zA-Z]{2,30}")){
            throw new MyException(Errors.ERROR_500,"Invalid name");
        }
        if(!lastname.matches("^[a-zA-Z]{4,30}")){
            throw new MyException(Errors.ERROR_500,"Invalid lastname");
        }
        if(age < 0){
            throw new MyException(Errors.ERROR_500,"Invalid age");
        }
        if(!address.getCountry().matches("^[a-zA-Z]{4,30}")){
            throw new MyException(Errors.ERROR_400,"Invalid country");
        }
        if(!address.getCity().matches("^[a-zA-Z]{5,30}")){
            throw new MyException(Errors.ERROR_500,"Invalid city");
        }
        if(!address.getStreet().matches("^[a-zA-Z]{5,30}")){
            throw new MyException(Errors.ERROR_400,"Invalid street");
        }
    }

    @Override
    public String toString() {
        return "User {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
