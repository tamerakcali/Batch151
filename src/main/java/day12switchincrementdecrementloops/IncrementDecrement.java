package day12switchincrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {

         int age=12;
        System.out.println("age = " + age);

        age = age++;//post increment:post increment tek kullanildiginda
        //yani assignment yapilmadan kullanilirsa sayiyi artirir.
        age++;
        System.out.println("age = " + age);

        age= ++age;//pre increment; burda dogrudan artirarak yazar. cunku java
        //yukaridan asagiya ve soldan saga dogru islem yapar.




    }
}
