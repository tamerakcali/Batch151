package day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line=new PriorityQueue<>();//ikinci alternatifi priority den constructor
                                                // alarak object olusturur.
//priorityQueue, belirlenen oncelik kuralina gore elementleri dizer. eger kural belirlenmemisse java
//kendisi bir kural belirler ve ona gore dizer.
        line.add("milk");
        line.add("meat");
        line.add("egg");
        line.add("orange");
        line.add("tomato");
        System.out.println("line = " + line);

        Deque<String> d=new LinkedList<>();
//deque==>doubleended queue, yani iki uclu queue demek, queue den farkli olarak ilk element yada son element
//ilk alinabilir.

        d.add("milk");
        d.add("meat");
        d.add("egg");
        d.add("orange");
        d.add("tomato");
    }
}
