package day13loops;

public class Loops02 {
    public static void main(String[] args) {
  //ex:verilen bir String de kucuk harfleri yazdirmayiniz
  //"Pwd12!aAb"==>P12!A
        String s="Pwd12!aAb";

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(c>='a' && c<='z'){
                continue;

            }else{
                System.out.print(c);

//ex:INTERVIEW QUASTION!!!

//bir String i ters  ceviren code u yazdiriniz.data olusturacagimiz icin iki
                //container kullaniyoruz. yani bos String container' i.
//"Java"==>avaJ
  //1.WAY:
                String t="Java";
                String ters="";
                for(int b=t.length()-1;b>=0;b--){
                    ters=ters+t.substring(b,b+1);
                    
                }
                System.out.println(ters);//sadece son istedigimiz datayi gormek icin yazdirmayi
                //method disina aldik,icine alsaydik her adimi yazdirirdik.

//2.WAY:for loop ve charAT() ile

                String u = "Java";
                String ters2 = "";

                for(int d=u.length()-1; d>=0;d--){
                    ters2 = ters2 + u.charAt(d);
                }
                System.out.println(ters2);

//ex:bir tamsayinin rakamlarinin toplamini veren code u yaziniz.
   //burdada yine yeni bir data olusturacagimiz icin yeni container yada variable olusturuyoruz.
  //578==>5+7+8=20


                int num1=0;
                for(int num=578; num>0; num=num/10){
                    num1=num1+num%10;

                }
                System.out.println(num1);

//eger tamsayi "-" negative ise once bunu Math.abs() methodu ile pozitive yapip sonra devam ederiz.

                int sum = 0 ;
                int n  =  -578 ;
                n=Math.abs(n);//eksi bir syai verildiginde de toplama yapmak icin matematik classindan mutlak deger alinir


                for(int n1=n;n1>0;n1=n1/10){//azaltmayi bolme ile yaptigimiz icin " i = i /10" yazariz.
                    //azaltma cikarma ve bolme ile yapilir.

                    sum = sum +n1%10;//sum + = i%10; da yazilir
                }
                System.out.println(sum);

        }

    }
}
}
