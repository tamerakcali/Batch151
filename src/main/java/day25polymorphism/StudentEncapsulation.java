package day25polymorphism;

public class StudentEncapsulation {

 /*encapsulation: to hide and protect a data.
 how to hide?=to convert its access modifier to private.
 a-encapsulation yaptigimiz datas i istersek okuyabiliriz.
 b- bu okumayi get methodu olusturarak  yapariz.
 c-bu teknigi mousun sag tiklayip generati den devam ederek yapariz.
 d-encapsulation yapilan data type boolean ise get method is ile baslar.
 e-encapsulation yapilan data yi set methodu ile degisiklik yapariz.
1-get methods help public olur.
2-get methods rtype i okudugu variables in rt si ile ayni olur.

f-encapsulation yaptigimiz data yi nasil degistiririz.set methodu ile;
set Methods:
1-hep public olur.
2- rt si hep void dir.
3-parametre kullanir. bunun data type variable ile ayni olur.



  */
       public String stdName="Tom Hanks'";
       public int age=23;
       private String stdId="Ac202302b";
       private double gpa=3.79;
       private boolean successful=false;

//encapsulation yaptigimiz data yi nasil degistiririz.
// bu teknigi mousun sag tiklayip generati den devam ederek yapariz.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
//encapsulation yapilan data type boolean ise get method is ile baslar.
    public boolean isSuccesfull() {
        return successful;
    }
// encapsulation yaptigimiz data yi nasil degistiririz.set methodu ile yapariz.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
