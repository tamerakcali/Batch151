package day_15practice_inheritance;

public class Memur extends Muhasebe{
 //NOTE:toString methodu kisa yoldan objects in tum
    //ozelliklerini yazdirmak icin pratik bir yontemdir.


    @Override
    public String toString() {
        return "Memur{" +
                "hourSalary=" + hourSalary +
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

        Memur memur1=new Memur();

  /*      //memur1 object,memur class in object i olmasina ragmen inherite ettigi muhasebe
        // ve onun da parent i olan personel class indaki tum variables i alabilir.  asagida da personel class
        indan perNo instance variable i  aldik,sonra name variable ni yine personel parent dan aldik.
   */

        memur1.perNo=1001;
        memur1.name="Ahmet";
        memur1.lastName="Tepe";
        memur1.address="Ankara";
        memur1.tel="31258974";
        memur1.hourSalary=15;
        memur1.status="Memur";
        memur1.salary=memur1.salaryCalcu();
        System.out.println(memur1.perNo);//1001
        System.out.println(memur1.tel);//31258974
        System.out.println(memur1.toString());//toString methodu kisa yoldan objects in tum
        //ozelliklerini yazdirmak icin pratik bir yontemdir.

      //////////////////////////////////////
        Memur memur2=new Memur();
        memur2.perNo=1002;//personel parent dan
        memur2.name="";//personel den
        memur2.lastName="";//personel den
        memur2.address="";//personelden
        memur2.tel="";//personelden
        memur2.hourSalary=15;//muhasebe
        memur2.salary=memur2.hourSalary*8*30;//3600€
        System.out.println(memur2.toString());

        System.out.println(memur2.perNo);//1002
        System.out.println(memur2.salary);//3600












    }






}
