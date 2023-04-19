package day17multdimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
//multidimensional array nasil olusturulur

      //  arr[][]==[[5,2],[11,34],[45,5]]
    // 11 i nasil aliriz==> arr[1][0]]

        String names[][]=new String[3][2];

        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";
        System.out.println(Arrays.deepToString(names));//[[A,K],[P,M],[C,Z]]
        //multidimensionalarray leri consol ayzdirmak icin toString methodu
        //degil deep.toString methodu kullanilir.

        //multidimensionalarray icerisinden specific bir eleman nasil yazdirilir?.

        System.out.println(names[1][1]);//ornegin "M"yi yazdirdik.

  //multidimensionalarray icindeki bir array i yazdirmak nasil yapilir? yani ic array lerden birini.

        System.out.println(Arrays.toString(names[0]));// [A,K]burda dis array in ilk indexi oldugundan 0 i aliriz.
        System.out.println(Arrays.toString(names[1]));

//ex:kisayoldan multidimensionalarray nasil olusturulur.
 String students[][]={ {"Ali","Kemal",}, {"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayhan"} };

    //yukaridaki students array inde toplam kac isim oldugunu yazdiriniz?

        int sum=0;
        for(String[] w:students) {
            sum = sum + w.length;
            System.out.println(sum);

//ex:ayni students array inde, icinde "m" olan isimleri yazdiriniz.

            for (String[] w1 : students) {
                for (String k : w1) {//dis array dekiler array oldugu icin block parantez yani array parantezi kullandik
                    if (k.contains("m")) {//ic array dekiler string oldugu icin k yi String nestedforloop olusturduk.
                        System.out.println(k);
                    }
                }
            }
            //ex:bir int multidimensionalarray olusturup,tum elemanlarin carpimini hesaplayiniz.

            int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

            int result = 1;//carpma oldugu icin olusacak yeni datanin degeri etkisiz eleman olan carpmada 1i koyariz.

            for (int[] w3 : nums) {

                for (int k : w3) {
                    result = result * k;

                }

            }
            System.out.println(result);//sadece sonucu gormek istedigimiz icin yazdirmayi loop un disinda yapiyoruz

            //ex;iki boyutlu bir array i tek boyutlu bir array e ceviriniz.

            int nums1[][] = {{5, 4}, {2, 3, 2}};//==>{5,4,2,3,2,}

//1.step:iki boyutlu array de kac eleman oldugunu bulan code yazmaliyiz.

            int totalEleSa=0;
            for(int[] w4:nums1){
                totalEleSa=totalEleSa+w4.length;

            }
 //2.step:tek boyutlu array i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz.
            int newArr[]=new int[totalEleSa];
 //3.step:iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz.

           int idx=0;
           for(int[] w5:nums1){
               for(int k:w5){
                   newArr[idx]=k;
                   idx++;
               }
           }
            System.out.println(Arrays.toString(newArr));//{5,4,3,2,2}


//ex:bir int multidimensionalarray deki en kucuk ve en buyuk elemanin toplamini bulunuz.

            int ages[][] = {{15, 4}, {12, 43, 21},{7}};//==>4+43=47 yazdirmamiz gerekir.

            int small=ages[0][0];

            int big=ages[0][0];
                                 //{{15,4},{12,43,21}}
            for(int[] w6:ages){

                for(int k:w6){
                    small=Math.min(small,k);
                    big=Math.max(big,k);


                }
            }
            System.out.println(small+big);

            }




        }








    }

