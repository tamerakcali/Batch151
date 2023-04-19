package day10practice;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //bir array olusturun ve tum elemanlari yazdirin?

        String names[] = {"ali", "veli"};

        //bir array olusturun ve array deki sayilari kucukten buyuge yazdirin

        int numbers[] = {5, 19, 15, 56, 23, 81, 99, 57};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //verilen array in tum elementlerini bir soldaki siraya tasiyacak yani 2,3,4,5,1 bir code yaziniz?
        int numbers1[] = {1, 2, 3, 4, 5};
        int temp = numbers1[0];
        for (int i = 0; i < numbers1.length - 1; i++) {
            numbers1[i] = numbers1[i + 1];
            System.out.println(Arrays.toString(numbers1));

        }
        numbers1[numbers1.length - 1] = temp;
        System.out.println(Arrays.toString(numbers1));

//verilen bir int array deki en buyuk sayiyi yazdirian method olusturun?

        int arr[] = {19, 57, 41, 32, 7, 6, 8};

          int maxNum=arr[0];
          for(int i=1;i<arr.length;i++){
              if(maxNum<arr[i]){
                  maxNum=arr[i];
              }
          }
        System.out.println("maxNum = " + maxNum);

    }
}
