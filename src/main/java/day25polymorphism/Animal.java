package day25polymorphism;

public class Animal {
    public void move(){
        System.out.println("animals move...");

/*Overriding yaptigimiz child class in access modifier i
          a-super(parent) class in access modifier inden daha dar olamaz.
          b-buna karsin tersi mumkundur. Yani overriding yapilan child class in access modifier in
          parent(super)class in access modifierinden daha genis olabilir.
          c-return typler; child parent iliskisinde child dan parent e "is a ... " iliskisi
          varsa return type degistirilebilir.
          d-aksi halde overriding de return type degistirilemez.
          e-methodun return type primitive datalarda overriding yapildiginda degistirilemez.
          f-methodun return type i void ise overriding yapildiginda rt degistirilemez.
          g-rt wrapper class oldugunda

1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir.
2)Child'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan dar olamaz.
3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar olabilir.

4)Method'un return type'i "primitive" ise Overriding yapildiginda "return type" degistirilemez.
5)Method'un return type'i "void" ise Overriding yapildiginda "return type" degistirilemez.

6)Child'da Override edilen method'un "return type"i ile Parent'taki method'un "return type"i arasinda "IS-A" iliskisi
  varsa "return type" degistirilebilir. Aksi takdirde degistirilemez.
  Mesela; Integer Wrapper Class ile Long Wrapper Class arasinda "IS-A" iliskisi yoktur, o yuzden
  return type Integer oldugunda Long'a degistirilemez.

7) Return Type Wrapper Class oldugunda, Overriding yaparken "return type" degistirilemez.
8)final methods overriding yapilamaz.body si degistirilemez.ancak overriding yaparken method body yi
degistiririz.
9)static methods overriding edilemez.cunku static methods tum child methos icin ortak methods dur.
bir child ortak methodu degistirdiginde diger childs bundan etkilenir.bu umulmadik sonuclar
ortaya cikarabilir. bu yuzden java buna musade etmez.
10)private methods overriding edilemez.cunku private lar sadece oldugu class da kullanilir.



 */
        }
    protected int toplama(int a,int b){
        return a+b;

    }
public final double  circleArea(double r){
        return 3.14*r*r;

}

}
