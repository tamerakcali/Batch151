package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //specific bir elemanin array de olup olmadigini anlamak icin gereken code u yaziniz.

        String names[] = {"K", "C", "R", "A","S"};

        String el = "A";
//1.WAY:
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }

        if (counter > 0) {
            System.out.println("Array has"+el);
        } else {
            System.out.println("Array has not"+el);
        }
//2.WAY:BinarySearch() methodu:alfabetik siraya(string lerde) koyup bolerek bulma islemi,surekli bolerek.

        Arrays.sort(names);
        int result=Arrays.binarySearch(names,'A');
        System.out.println(result);
        if(result<0){
            System.out.println("Array  has not"+ el);
        }else{
            System.out.println("Array has" +el);
        }

    }
}