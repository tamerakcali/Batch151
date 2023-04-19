package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {
        //COLLECTIONS:ayni type  datalarin biraraya getirilip saklanmasidir.   
        
 /*
 1-arrayList ler element ekleme ve silme isleminde tekrar indexleme yapmak zorunda
 olduklarindan,bu islemleri yapmada basarisizdirlar, yani cok yavas yaparlar. Coklu ekleme ve
 silme islemleri yaparken LinkedList kullanilir.
 Java bu sorunu cozmus ve buna da "LinkedList" demis. Bu yapi indexleme yapmiyor
 sadece elementleri silip ve ekliyor.
 2-LinkedListler, node ekleme ve silme islemleri yaparken,sadece pointer lari degistirir.
 3-arrayList ler coklu data depolamak icin elverislidir, ancak LinkedList ler coklu data barindiran
 islemlerde silme ve ekleme cok yapiliyorsa kullanilir.Element bulma isleminde ArrayList ler 
 cok basarilidir,cunku indexle calisir ve reference esas alir.Ancak LinkedList ler node bulma
 isleminde basarisizdirlar.  
 4-LinkedList ler nonm-primitive data kullanir.Tum collections non-primitive data kullanir.
 
  LinkedListler de her elementin bulundugu kutu iki bolumludur. Birinci bolumde
  data bulunur, diger bolumde pointer bulunur.Linkedlist deki bu element yapisina"Node" denir.
  -Yani LinkedList ler index kullanmazlar.
  -bu yapida en basta ki node u gosteren pointer a "head", sondaki elemente de "tail" denir.

    hashset setlerin en hizlisisdir,
    */

    LinkedList<String> s=new LinkedList<>();
    
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");//2. siraya esen i ekle demek,yani ajda ila muge arasina

        System.out.println("s = " + s);
         String s1=s.peek();//ilk node u verir ama silmez yani copy+paste gibi
        String s2=s.poll();//ilk node u siler ve verir yani cut+paste ggibi.
        
        s.element();//peek gibi ilk node u silmeden bize verir
    }
}
