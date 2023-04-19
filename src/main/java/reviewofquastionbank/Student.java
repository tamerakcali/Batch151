package reviewofquastionbank;

public class Student extends Person {

    private String schoolNum;
    private String classes;


    public Student(String nameSurname, String tcNum, int age, String classes) {
        super(nameSurname, tcNum, age);
        this.classes = classes;
    }

    public Student(String nameSurname, String tcNum, int age) {
        super(nameSurname, tcNum, age);

    }
}
