package day38enumsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators_01 {

    public static <List> void main(String[] args) {

  /*
  1-iterators loop larin yaptigi ayni function a sahiptir,yani ayni isi yaparlar.
  2-loop lar sonsuz donguye girebilirler.
  3-Iterators larda sonsuz loop olusma ihtimali yoktur.aralarinda performance farki yoktur.
  4-iterators bir collection dan element silme ve elementi degistirme konusunda daha
  basarilidirlar.
  5- "descending()" methodu ile dogrudan sondan basa yapariz.
  Yani ancak LinkedList ile descendingItr kullanabiliriz.Bunun icin once LinkedList yapmaliyiz listimizi
  5-iki tip iterators vardir
  a-ITERATOR:bu sadece element silmek icin kullanilir.Element ekleme veya degistirme
  mumkun degildir.
  b-LISTITERATOR:Bu elementleri silebilir,ekleyebilir ve degistirebilir.

  NOTE:Iterator, sadece soldan saga calisir.ilk elementde son element e.
  ListIterator ise cift yonlu calisir.


        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom,Jim,Clara,Angie,Mark]
//iterator kullanalim
        Iterator<String> myItr=myList.iterator();
        while(myItr.hasNext()) {//pointer e senden sora element varmi sorar


            myItr.next();//pointer i bir sonraki elementin onune tasir
            myItr.remove();//next() methodunun return ettigi elementi siler,ayni zamanda list dende otomatik siler

            System.out.println(myList);//[]

//ListIterator kullanalim

            List yourList=new ArrayList<>();
            yourList.add("Tom");
            yourList.add("Jim");
            yourList.add("Clara");


            ListIterator<String> yourListItr=yourList.listIterator();
            while(yourListItr.hasNext()){

                String el=yourListItr.next();
                yourListItr.set(el+"!");//listi update etmeye yarar ama listIterator da sadece.

        }
            System.out.println("yourListItr = " + yourListItr);//[Tom!,Jim!,Clara!]

        //hasPrevious() ve previous  nasil kullanilir?
//has.Previous u kullanmak icin pointer en sonda olmalidir,yoksa kullanilamaz.
      while(yourListItr.hasPrevious()){
          String el=yourListItr.previous();
          system.out.print.ln(el);//Clara!
                                  //  Jim!
                                  //  Tom!

          yourListItr.set("?"+el);
      }
        System.out.println(yourList);//[?Tom!,?Jim!,?Clara!]

 //has.Previous u en sondan en basa dogrudan yani has.Previous olmadan nasil kullaniriz?

   LinkedList<String> ourList=new LinkedList<>();//bunu ancak LinkedList e cevirerek yapabiliriz
                                                //onun icin once LikedList yapmaliyiz
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        system.out.println(ourList);//

        our.List.descendingIterator();//dogrudan sondan basa descending methodu ile yapariz.Yani ancak LinkedList
                                       //ile descendingItr kullanabiliriz.

        Iterator<String> ourList=ourList.des.descendingIterator();

        while(ourListItr.hasNext());
        String el=ourListItr.next();
        system.out.println(el);//Mark,Angie,Clara,Jim,Tom




*/


    }

    }


