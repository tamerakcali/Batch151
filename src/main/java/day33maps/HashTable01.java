package day33maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {

  /*
 HashMap ile HashTable arasindaki farklar(INTERVIEW SORUSU!!!!)
 1-HashMap "thread-safe degildir" hashTable "thread-safe" dir.

 Thread-safe:coklu isi ayni anda yapma islemidir


 2-HashMap "synchronized" degildir ancak hashTable "synchronized" dir.

 3-HashMap bir tane null key e ve istenilen kadar null value ye musaade eder,
 HashTable key lerde de value lar dada "null" kullanilmasina izin vermez.

 4-HashMap hizlidir, HashTable ona gore yavastir

 5-Ikisi de entries leri random siralar

   */

        Hashtable<String,Integer> stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        stdAges.put(null,34);//hashtable lerin key lerine null konulamaz.ama ilginc burda errror vermedi.




    }
}
