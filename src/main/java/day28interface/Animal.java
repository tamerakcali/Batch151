package day28interface;

public interface Animal {

/* 1- child class==>class:extends yani child class i parent classin child i yaparken extends
2-interface==>interface:extends-interface i interface child i yaparken extends
3-class==>interface:implements child class i interface in child i yaparken implements keyword yazariz.

yani ayni ise extends farkli ise implements kullanilir.

!!!!:bir interface de abstract method olusturdugumuzda, child class lara gidip bu methodu
override etmek zorundayiz. yoksa app hata verir.

 */
         void eat();
         void drink();
 /*VARIABLES:
1- Inteface deki tum variables otomatik olarak final dir. Bu yuzden interface icindeki
 variable i olusturdugumuzda mutlaka deger assign etmeliyiz.
2-Bilindigi gibi final variables in degeri degistirilemez.
3-interface deki tum variables default olarak public dir.
4-Interface deki tum variables default olarak "static" dir.
5-Interfaces de variables interface ismi ile cagrilir,bu hem static variable olmanin
hem de okunurluluk acisindan onemlidir.
  */
         int age=4;

 /*!!!!:INTERVIEW SORUSU:ABSTRACT CLASS ILE INTERFACE ARASINDAKI FARKLAR
 1- abstract classes hem abstract hem de concrete methods icerebilir,ama interfaces sadece
 abstract method icerir. Interfaces de istersek default ve static keywords kullanarak
 concrete method olusturabiliriz.
 2- Abstract classes multi-inheritance yi desteklemez ama interface destekler.
 3-Abstraact classes icinde her turlu variable olusturulabilir. Ancak interface icinde
 ki variables public,static ve final olmak zorundadir.
 4-interface class in child i olamaz ama abstract  class in child i olabilir.
 5-Abstract classes de constructor vardir ama object uretemez,interface lerde
 constructor yoktur onun icin object uretemez.


  */
}
