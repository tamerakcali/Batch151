package reviewofquastionbank;

public class Teacher extends Person{

    private String branch;
    private String sicilNo;

    public Teacher(String nameSurname, String tcNum, int age, String branch, String sicilNo) {
        super(nameSurname, tcNum, age);
        this.branch = branch;
        this.sicilNo = sicilNo;

    }
}
