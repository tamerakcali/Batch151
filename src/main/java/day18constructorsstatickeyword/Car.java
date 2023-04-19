package day18constructorsstatickeyword;

public class Car {


    String make="Honda";
    String model="Accord";
    int year=2021;
    int price=18000;

     /*  constructor nasil olusturulur:
  1-Access modifier
  2-Class name
  3-Paranteses
  4-Curly braces ==> access modofier + class name +() +{}
   methodlar ile farki:
   1-Methodlarda return type vardir, constructor ler de olmaz
   2-"Method"lar yaptiklari ise gore isimlendirilirler,constructorlar her zaman class ismi ile
     adlandirilirlar.
   3-"Method" lar bir action yapmak icin olusturulur,consturctor lar ise object olusturmak icindir.
      Yani constructor lar sadece object olusturur.
   4- Method lar kucuk harfle baslar, constructor isimleri class ismiyle ayni oldugu icin buyuk harfle baslar.

 !!! NOTE:parametreli constructor lar olusturarak ayni class dan farkli ozelliklere sahip objeler olusturabiliriz.
   */
    //default constructor gorulmezler, parametre kullanmazlar yani parantez.

    public Car(){}// bu default constructor

    // farkli objectler icin her seferinde kalibi degistirmemiz gerekir. Bunun yerine
    //yeni bir constructor olusturup asagidaki snytax ile esnek bir constructor olusturabiliriz.


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
     }

//custom constructor(kendimiz manuel olusturdugumuz constructor a custom denir)

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }
}



