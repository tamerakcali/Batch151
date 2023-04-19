package day24inheritancepolymorfhism;

public class Car {
    public void move() {
        System.out.println(" cars move...");

        }
    public void getBreak(){
        System.out.println("cars break...");
    }
  /*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)super() sizi parant class'daki constructor'a tasir.
    5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
    6)"this()" icinde bulundugunuz variable'lari cagirmaya yarar
      "super()" parent class'daki variable'lari cagirmaya yarar
      7-Parent ten Child a HAS-A ilişkisi var. yukarıdan aşağıya yani.
Animal-Mammal-Cat-Van Cat
Animal has a cat, mammal a van cat, cat has a van cat
Child dan parent a IS-A ilişkisi vardır.
Cat is a animal, van cat is a mammal, mammal is a animal,
eğer data tipleri arasında IS-A ve HAS-A ilişkisi varsa bu data tiplerine COVARIANT denir.


B)Polymorphism==> Coklu sekil
      Yani bir method'un farkli sekillerde karsimiza cikmasi demektir.
      Polymorphism = Overloading(+) + Overriding(-)
    a)Overriding parents class'daki method'u child class'in ihtiyaclarina gore ozellestirerek kullanmak demektir.
    b)Overriding'de method'un body'si degistirilir.
    c)Overriding'de method signature'a dokunulmaz. Dokunulursa Java hata verir,kabul etmez.


 */

    public void engine(){
        System.out.println("cars have engine...");
//object class en ustteki parent class tir. Hz. Adem gibi.
//java default constructorlari object class in icine koyar.
//methods kullanabildigimiz gibi inheritance de variables da kullanabiliriz.
}
     public String model="";
    public int price=0;

    public Car(){
        System.out.println(" car constructor 1");
    }
    public Car(int i){
        System.out.println("car constructor 2");
    }
}
