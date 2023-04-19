package day13_practices;

public class C01_StaticKeyword {
    //bir tane static variable, bir tane instance variable olusturunuz. Bunlarin kullanimini
    //main icinde gosteriniz?

    static int num;//static variable,value assign edilmedigi icin default value 0 dir
           int num1;//instance variable

    public static void main(String[] args) {

        C01_StaticKeyword obj1=new C01_StaticKeyword();//num1 i cagirmak icin object olusturmamiz gerekir
        C01_StaticKeyword obj2=new C01_StaticKeyword();//

       // int num=1;//static oldugu icin object olusturmadan class dan direk cagirdik main icinde.

        System.out.println("num = " + num);//0 dir.static oldugu icin dogrudan cagirdik
        System.out.println(obj1.num);//0 dir static variable cagirdigimiz icin tum objeler icin aynidir.
                                    //gokteki ay gibi
        num++;
        System.out.println(obj1.num);//1 ancak static oldugu icin obj ile birlikte yazmaya gerek yoktur
        System.out.println(obj2.num);//1 ikisi icinde aynidir cunku static variable dir
        System.out.println(obj2.num1);//0 dir cunku instance variable ve sadece ilgili object e baglidir.

        obj2.num++;//static
        obj2.num1++;//instance

        System.out.println(obj2.num1);//0
        System.out.println(obj2.num);//2

        obj2.num1++;
        System.out.println(obj2.num1);//2






    }

}
