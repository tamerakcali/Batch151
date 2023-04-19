package day39lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Lambda_01 {
 /*
 Lambda;
!!!!!  -colectionlarda
!!!!!  -List lerde kullanilir ancak
       -map lerde kullanilamaz.


 1- var olan elementleri degistirme "map()" ile yapilir.
2- "distinct()" methodu elementleri tekrarsiz yazdirir
3- "filter()" ile eleme islemi yapilir.yani istenilmeyen elementi eler.
4-"comparator.comparing()"  siralamayi biz belirleyeceksek   kullanmaliyiz
5-Lambda "Functional Programming" bir yapidir,simdiye kadar yazdigimiz code ve methodlar
"Structured Programing" idi.
6-"reverse order()" methodu sorted() methodunun aksine sondan basa dogru siralama yapar.


  */

    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angeline");


      printElem(myList);
        System.out.println();
      printEleme(myList);
      prtEleExcepStartsWithT(myList);
      prtElLengLesTHThree(myList);
      prtElLengtMoreThFourWithUp(myList);
      prtMorFourAndLowCas(myList);
      prtElUniqUpSort(myList);
      prtLast(myList);

    }
//ex:bir list deki elementleri consola yazdiran method u olusturunuz?
    
     public static void printElem(List<String> myList){
 //1.WAY: for each ile;
        for(String w:myList){//geleneksel for-each yapisina "structured programming" denir.
            System.out.println(w+" ");//Tom,Jim,Clara
        }
     }


 //2.WAY:lambda Expression ile
    public static void printEleme(List<String> myList){

        myList.stream().forEach(t-> System.out.println(t));//Tom,Jim,Clara. sadece methodun  kullanildigi yapilara
                                                           //"functional programming" denir.burda oldugu gibi
    }
//ex:bir list deki "T" ile baslayanlar haric tum elementleri consola yazdiran methodu olusturunuz?

         public static void prtEleExcepStartsWithT(List<String>myList){

        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.println(t+" "));//Jim,Clara

         }

//ex:bir list de character sayisi 4 den az olan tum elementleri consola yazdiriniz?

     public static void prtElLengLesTHThree(List<String> myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.println(t+" "));//eleme islemi filter ile yapilir

     }

    //ex:bir list deki character sayisi 4 den buyuk olan tum elementleri buyuk harflerle consola
    //method ile yazdirin.
    public static void prtElLengtMoreThFourWithUp(List<String> myList){

        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.println(t+" "));
        //CLARA, var olan elementleri ve elementler deki  degistirme "map" ile yapilir.
    }
//ex:bir list deki character sayisi 4 den cok olan elementleri tekrarsiz olarak kucuk harflerle
    //consola yazdiran methodu olusturun?

    public static void prtMorFourAndLowCas(List<String>myList){

               myList.stream().//functional programming de noktadan sonra asagi alinir syntax
                distinct().
                 filter(t->t.
                length()>4).
                 map(t->t.
                toLowerCase()).
        forEach(t-> System.out.println(t+""));//clara,angeline.distinct methodu tekrarsiz yazdirir.

    }
//ex:bir list deki elementleri tekrarsiz olarak buyuk harflerle alfabetik sirada consola yazdiran methodu olusturun?

    public static void prtElUniqUpSort(List<String>myList){

                  myList.
                          stream().
                  distinct().
                  map(t->t.
                  toUpperCase()).
                  sorted().forEach(t-> System.out.print(t+" "));// ANGELINE,CLARA,JIM,TOM


    }
  //ex:bir list deki elementleri tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayark yazdirin

  public static void prtLast(List<String>myList){

 myList.
         stream().
         distinct().
         map(t->t.toLowerCase()).
         sorted(Comparator.comparing(t->t.length())).//siralamayi biz belirleyeceksek com.comparing i kullanmaliyiz.
         forEach(t-> System.out.println(t+" "));//tom,jim,clara,angeline

  }



}
