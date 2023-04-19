package day27interface;

public interface Engine {
    public void start();

 /*
 NOTE:Birden fazla parent class kullanilamaz.yani java multi-parent kullanmaya izin vermez.
 bu durumu cozmek icin bu class lar interface yapilarak sorun cozulmus olur.

 Interface methods kurallari:
 1-Bir interface icine concrete method(yani body si olan method) konulamaz.
2-Interface icindeki methods un abstract oldugunu java bilir. bu nedenle
interface icindeki abstract methodlarda abstract keyword kullanmaya gerek yoktur.
3-Interface deki tum methodsun access modifier i tamami public tir. bu yuzden interface icinde
abstract method olustururken,access modifier yazmaya gerek yoktur.
4-bir interface i bir concrete class in parent i yapmak istedigimizde,
"extends" keyword yerine implement keyword kullaniriz.
5-Concrete(body li)child claass lar parent interface deki abstract methodsu
override etmek zorundadirlar.
6-Interface ler bir application daki yapilmasi zorunlu isleri barindirirlar.
Yani "to-do list" function lari barindirirlar. Bu yuzden to do list de denir.
7-interface icinde birden fazla  ayni isimli abstract
method olusturulabilir.Abstract methodsun body si olmadigi icin,child
classlar bunlardan birini override edip kullanabilirler.Ancak bunlarin return
type lari da ayni olmalidir.
8-Kural olarak interface icinde concrete(bodysi) olan method koyamayiz.
Bunu java cozmus ve interface icine body li method olusturmayi saglamistir.
"default" keyword u kullanarak concrete method interface icinde olusturabiliriz.
Bu access modifier degil, cunku deafult access modifier zaten
 yazilmaz.Burdaki concrete method keywordu dur.Asagidaki gibi.

        default void eco(){
        System.out.println("uses gas less...");

9-Ikinci yol concrete method yapmak icin "static" keyword u kullanmaktir.

        static void stop(){
      }
10-Default veye static keywordu kullanarak olusturdugumuz concrete methodsun
concrete child classlar tarafindan kullanilma zorunlulugu yoktur.
11-Default keywordunu kullanarak olusturdugumuz concrete methodslara object
olusturarak ulasilabilir.Ancak static keywordu kullanarak olusturdugumuz
concrete methodslara ulasmak icin object olusturmaya gerek yoktur. interface
ismi yeterlidir.
12-Interface lerde object olusturulamaz.Cunku interface icinde yarim method yani
body siz method vardir.Bunu ancak child classlardan object
olusturarak ulasabiliriz.
13-Interface lerin constructor u yoktur.

1- child class==>class:extends yani child class i parent classin child i yaparken extends
2-interface==>interface:extends-interface i interface child i yaparken extends
3-class==>interface:implements child class i interface in child i yaparken implements keyword yazariz.

yani ayni ise extends farkli ise implements kullanilir.

!!!!:bir interface de abstract method olusturdugumuzda, child class lara gidip bu methodu
override etmek zorundayiz. yoksa app hata verir.

VARIABLES:
1- Inteface deki tum variables otomatik olarak final dir. Bu yuzden interface icindeki
 variable i olusturdugumuzda mutlaka deger assign etmeliyiz.
2-Bilindigi gibi final variables in degeri degistirilemez.
3-interface deki tum variables default olarak public dir.
4-Interface deki tum variables default olarak "static" dir.
5-Interfaces de variables interface ismi ile cagrilir,bu hem static variable olmanin
hem de okunurluluk acisindan onemlidir.

!!!!:INTERVIEW SORUSU:ABSTRACT CLASS ILE INTERFACE ARASINDAKI FARKLAR
 1- abstract classes hem abstract hem de concrete methods icerebilir,ama interfaces sadece
 abstract method icerir. Interfaces de istersek default ve static keywords kullanarak
 concrete method olusturabiliriz.
 2- Abstract classes multi-inheritance yi desteklemez ama interface destekler.
 3-Abstract classes icinde her turlu variable olusturulabilir. Ancak interface icinde
 ki variables public,static ve final olmak zorundadir.
 4-interface class in child i olamaz ama abstract  class in child i olabilir.
 5-Abstract classes de constructor vardir ama object uretemez,interface lerde
 constructor yoktur onun icin object uretemez.




  */
    static void stop(){
        System.out.println(" stops secuerly...");
    }

}
