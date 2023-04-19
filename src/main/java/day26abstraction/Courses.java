package day26abstraction;

public abstract class Courses {
/*
1-bazen parent class daki methodun body si hicbir child class tarafindan
kullanilmaz. bu durumda parent daki methoda body yazmak, kullanilmadigi icin
mantikli degildir.dolayisiyla bu methoda body yazilmaz. body si yazilmayan methoda
"abstract" method denir. abstract means without body in English.

2-Methodun body sini yazmayinca java error verir. bunun icin abstract keyword unu class a
ekleyerek, javaya bu methodun body si olmayacak deriz.

3-Parent deki method abstract ise butun child classes o methodu overriding yapmak
zorundadir.Bu yuzden tum childlar icin mecburi olmasini istedigimiz functionalities
abstract yapariz.

4-Body si olan methods(concrete method) abstract class larin icine yazilabilir.

5-Ancak abstract methods concrete class larin icine yazilamazlar.

6-Abstract keyword ile method body bir method da ayni anda kullanilamaz.

7-Abstract classes icinde abstract methods olur. Abstract methods body si olmadigi
icin eksik method dur. Yani abstract class icinde eksik bir yapi barindirir.
Absrtact class dan object olusturursak. bu class daki eksiklik object e yansir.
Bu ise eksik bir object olur.Java bunu istemez.Bunun sonucunda yapilan applacation
in yanlis calismasina neden olur. Bu nedenle java abstract clases dan object olusturmayi
engellemistir.

8-Abstract class larin constructor u vardir ama object olusturamaz.

9-Private methods abstract olamazlar.

10-Final methods abstract methods olamazlar.

11-Abstract classin abstract child class i oldugu gibi concrete child class i da
olabilir.



NOTE:(interview sorusu hem de)final keyword java da ne ise yarar?
Final keyword;
a-variables larda kullanilabilir,
1-o variables a kesinlikle value atanmalidir.
2-Ilk atanan value degistirilemez.


b-methods da kullanabiliriz;
1-Final, methods da kullanildiginda, o methodun body si degistirilemez,
body degistirilemedigi icin overriding yapilamaz.

c-class larda kullanilabilir.
1-Class larda kullanildiginda, o class in child class i olamaz.ama final class in
kendisi child olabilir.




 */
    public abstract void math();
    public void art(){
        final double pi=3.14;

    }

}
