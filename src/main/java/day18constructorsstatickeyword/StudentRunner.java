package day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {

  //static olan numOfRegistered variable sini cagirmak icin sadece class ismini kullandik.asagida

 //static variables e object uzerinden de ulasabiliriz ama bu hatadir.       System.out.println(Student.numOfRegisteredStd);

        Student s1=new Student();
        System.out.println(s1.num);//non-static variable ye ulasmak icin object olusturduk.

    }
}
