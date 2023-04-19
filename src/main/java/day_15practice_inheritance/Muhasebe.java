package day_15practice_inheritance;

public class Muhasebe extends Personel{

    protected int hourSalary;
    protected String status;
    protected int salary;

    protected int salaryCalcu(){
        int salary=hourSalary*8*30;
        return salary;

    }


}
