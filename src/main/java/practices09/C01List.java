package practices09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01List {
    public static void main(String[] args) {

/*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println("numbers = " + numbers);
       for(int i=0;i<numbers.size();i++){//0'dan listin(numbers) uzunluguna kadar donguye aldik

           if(numbers.get(i)>10){//listin(numbers) i inci indexindeki elementi getirdik 10'dan buyuk mu kontrol ettik
               numbers.set(i,numbers.get(i)*2);//10'dan buyukse i inci indexdeki elementi 2 katiyla set ettik
           }

        }
        System.out.println("numbers = " + numbers);
    }
}
