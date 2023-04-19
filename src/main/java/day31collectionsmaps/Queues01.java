package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static  void main(String[] args) {
  /*
  queue first in first out kurali ile calisir. yani ilk giren ilk cikar.
   */
        
        
        Queue<String> wareHouse=new LinkedList<>();//tabloya gore iliskili oldugu linkedList oldugu
                                                    //icin linkedList in constructor unu kullanir.
        wareHouse.add("milk");
        wareHouse.add("meat");
        wareHouse.add("bread");
        wareHouse.add("egg");
        wareHouse.add("cheese");
        System.out.println("wareHouse = " + wareHouse);
        
        wareHouse.remove();//ilk elementi siler.
        System.out.println("wareHouse = " + wareHouse);

        System.out.println(wareHouse.peek());//[meat] ilk elemani verir.hic element yoksa "null" verir
        wareHouse.element();//ilk elementi verir, bos ise hata verir.
        wareHouse.poll();//ilk elemani siler ve verir.bos ise "null" verir.
        wareHouse.clear();//tumunu siler.
        wareHouse.remove();//ilk elementi verir bos ise hata verir.exception(error) verir.
        
        
    }

    

}
