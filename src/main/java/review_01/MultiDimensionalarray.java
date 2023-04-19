package review_01;

import java.util.Arrays;

public class MultiDimensionalarray {
    public static void main(String[] args) {

/*
         Soru 4) Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)

 */
        int numbers[][] = {{1, 2, 3}, {4, 5}, {6, 7}};

        int newArray[] = new int[numbers.length];

        int sum = 0;

        int i;
        for (i = 0; i < numbers.length; i++) {

            int j;
            for (j = 0; j < numbers[i].length; j++) ;

            sum+= numbers[i][j];

        } newArray[i] = sum;


        System.out.println(Arrays.toString(newArray));


          try {


          }catch(ArrayIndexOutOfBoundsException e){
              int j = 0;
              if(numbers[j].length==numbers[i].length){

                  System.out.println(Arrays.toString(newArray));
              }else{
                  System.out.println("do not enter over numberslength");
              }

          }
    }

}
