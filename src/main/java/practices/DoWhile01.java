package practices;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
     /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */

    Scanner scan=new Scanner(System.in);
        System.out.println("please enter height number");
    double height=scan.nextDouble();//kullanici 4 metre versin.
    double sum=0;
    int hitNum=0;

    do{
        sum+=height;
        hitNum++;
        sum+=height*0.5;
        height= height*0.5;

    }while(height>=1);
    sum+=height;//top havada kalmasin diye burayi bir kez daha olusturduk.
    hitNum++;
        System.out.println("the number of hits..."+hitNum);
        System.out.println("totally yapilan yol..."+sum);

    }
}
