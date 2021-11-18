package lab2.task3;

public class Main {
    public static void main(String[] args) {
        final Student vasyl = new Student("Vasyl");
        final Subject math = new Subject("Math");
        final Grade grade = new Grade();

        grade.setStudent(vasyl);
        grade.setSubject(math);
        grade.setValue(5);

        final Grade grade2 = new Grade("Paul", "English", 4);
        System.out.println(grade);
        System.out.println(grade2);
    }
}

