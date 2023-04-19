package day40lambda;

public class Utils {
    /*
  util sik kullanilan demektir. Eger bir method cok sik kullanilacaksa ayri bir utils class olusturularak burdan import edilir.
     */

    public static int getSquare(){
      return a*b;


    }
    public static int getSumOfDigits(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }

}