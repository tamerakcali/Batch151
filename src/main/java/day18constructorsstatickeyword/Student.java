package day18constructorsstatickeyword;

public class Student {
    /*
    NOTE:1-Static "class memmbers" (variable +method +constructor + code blocks) tum objects
    tarafindan paylasilir.
         2-Static class members daki degisiklikler, tum objects tarafindan otomatik olarak gorulur.
         3-Static class members;gokteki ay in dunyaya bagli oldugu gibi,class da baglidirlar.
         Bu nedenle "static variables lara class variables' de denir."
         4-Static class members'in nasil calistigini anlamak icin cizim yapip static olanlari class a
         olmayanlari object e baglayarak dusunmek bu konuyu kolaylastirir.
         5-Static class members cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
         6-ancak non-static classes(members) cagirmak icin object olusturmak sarttir.

         non-static==instance==object synonym

          dir ayni anlamdadir.
     */

// bir datada yapacagimiz degisikligin otomatik olarak data ile baglantili diger yerlerde degistirilmesine
//"static" denir. diger halde non-static datadir.

  public static int numOfRegisteredStd = 0;//static

  public  int num=0;//non-static

    public Student() {
         numOfRegisteredStd++;
         num++;
    }

    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(numOfRegisteredStd);//3

        System.out.println(s1.num);//1







    }
}
