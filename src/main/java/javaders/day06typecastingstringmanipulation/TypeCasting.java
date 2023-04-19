package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {
        //short data type inde bir data olusturup, byte data type ine donusen data type ni yaziniz?
        
        short num=260;
        byte numByt = (byte) num;
        System.out.println("numByt = " + numByt);

        byte numByte=4;
        short num2=numByte;

        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);
        

        int intS=8800;
        short shortS= (short) intS;
        System.out.println("shortS = " + shortS);

        //explicit narrowing de: kalan bolenin yarisindan buyukse,kalan sayiyi java kucultmek ister,
        // bu durumda boleni bir buyuterek kalani - olarak yazdirir.
    }
}
