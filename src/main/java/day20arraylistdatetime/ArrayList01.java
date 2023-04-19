package day20arraylistdatetime;

import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
//NOTE:1-ArrayList lerde string class kullanmak tercih edilir,cunku string class method acisindan cok zengindir.
//     2-List.of() kullanarak kisa yoldan list olusturabilirsiniz,ama bu list in elemanlari degistirilemez.
//     3-Bu list lere yeni eleman eklenemez.
//     4-Bu list lerden eleman da silinemez.

//ex: Kullanicinin girdigi harf List'te var ise o harfi "Buldum!" a cevirin yoksa o harfi list'e ekleyin

        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter = input.next().toUpperCase().substring(0, 1);
        System.out.println("my list");

        if (myList.contains(letter)) {
            myList.set(myList.indexOf(letter), "buldum");

        } else {
            myList.add(letter);

        }

        System.out.println("myList");

//ex: bunu tekrarli yapmak istersek eger do ile yapariz.

        int counter = 0;
        do {
            if (counter == myList.size()) {
                System.out.println("myList");
                break;

            }
            Scanner input1 = new Scanner(System.in);
            System.out.println("Please enter a letter");
            String letter1 = input.next().toUpperCase().substring(0, 1);
            System.out.println("my list");

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "buldum");

            } else {
                myList.add(letter);

            }

            System.out.println("myList");
        } while (true);


//ex

            /*
                Example 1: Bir Integer List' teki birbirine en yakin iki elemani bulunuz.
                [12,23,10,19] ==> 12 and 10
             */


            List<Integer> nums = new ArrayList<>();
            nums.add(13);
            nums.add(13);
            nums.add(14);
            nums.add(10);
            System.out.println(nums);//[12, 23, 10, 19]

            //Collections.sort (nums); method' u nums List'indeki elemanlari "natural order" yapar.
            Collections.sort(nums);
            System.out.println(nums); //[10, 12, 19, 23]

            int minDiff = nums.get(1) - nums.get(0);

            for (int i = 1; i < nums.size(); i++) {
                minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
            }
            System.out.println(minDiff);

            for (int i = 1; i < nums.size(); i++)
                if (nums.get(i) - nums.get(i - 1) == minDiff) {
                    System.out.println(nums.get(i) + " and " + nums.get(i - 1));



                        }
                    }
                }
















