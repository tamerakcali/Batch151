package day_01_practice;

public class C03_Ascii {
    public static void main(String[] args) {

        //ex: CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız.

/*bu harfleri kullanamayacagimiz icin yine ascii ile ancak ornegin
'C' icin B nin ascci karsiligi + 1, 'E' icin D ni ascii karsiligi +1 M icin L nin ascii
karsiligi +1
          B ==> 66 +1        C ==> 67
          D ==> 68 +1        E ==> 69
          L ==> 76 +1        M ==> 77

*/
        char first='B'+1;//C

        char second='D'+1;//E

        char third='L'+1;//M
        System.out.println("" +  first + second + third);//baslarina hiclik
        // yani bir cift tirnak(string) isareti koyarak yanyana yazdirdik.





    }
}
