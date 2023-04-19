package day11nestedifternaryswitch;

public class Ternary03NestedTernary {
    public static void main(String[] args) {
 //ex: find the output for y=8, y=12, y=4, y=5
 //(y>5)?(y<10 ? 2*y : 3*y) :(y>10 ?2+y :3+y);
        
 //ex 2:verilen yilin "artik yil(Leap year)" olup olmadigini kontrol eden code yaziniz.
 //1-yil 100 e bolunurse 400 ede bolunmelidir
 //2-yil 100 e bolunmuyorsa 4 e bolunmelidir.


 //1.WAY:nested ternary
        int year=2005;
        String result=year %100==0 ?(year%400==0? "Leap" :"Not Leap"): (year%4==0 ? "Leap" :"Not Leap");
        System.out.println("result = " + result);
 
        
        
        
        
        
    }
}
