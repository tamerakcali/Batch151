package day_15practice_inheritance;

public class SurekliIsci extends Isci{
    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", hourSalary=" + hourSalary +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                ", perNo=" + perNo +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SurekliIsci isci1=new SurekliIsci();

        isci1.perNo=5001;//personel den
        isci1.name="Mehmet";//personel den
        isci1.isciStatu="";//muhasebe den
        isci1.shift();//isci den inherited
        System.out.println(isci1.toString());//SurekliIsci{isciStatu='isci', hourSalary=0, status='null',
        // salary=0, perNo=5001, name='Mehmet', lastName='null', address='null', tel='null'}







    }



}
