package reviewofquastionbank;

import java.util.Arrays;

public class Arrays_01 {

    public static void main(String[] args) {

  int arr[]={1,23,12,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,12));


        int arr1[]={12,23,13,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,12));//ilk arr de 3.element oldugu icin yukaridaki sirasini
                                                            //yazdiriyor.
        int arr2[]={12,23,13,2,3};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2,5));//-3

        String s="I like to move it move it ";
        String arr3[]=s.split(" ");
        System.out.println(arr3.length);//8

        String arr4[]=s.split("move");
        System.out.println("arr4"+arr4[1]);//it

        String arr5[]=s.split("it");
        System.out.println(Arrays.toString(arr5));//[I like to move ,  move ,  ]





    }
}
