package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

     //soru:short data typenin minimum ve maximum degerlerini code yazarak bulun?

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short MinShort = Short.MIN_VALUE;
        System.out.println("MinShort = " + MinShort);

        //soru:int data typeinin minimum degeri ile byte data type nin maximum degerlerinin toplamini yaziniz?

        int intMinValue = Integer.MIN_VALUE;

        byte byteMaxValue = Byte.MAX_VALUE;

        System.out.println("intMinValue" + "byteMaxValue");

        //soru:primitive int i wrapper Integere a ceviriniz?

        int num = 13;
        Integer wrapperNum = num;
        //bu isleme autoboxing denir.


        //soru:Wrapper Byte i primitive byte ceviriniz?

        Byte k = 33;
        byte prik = k;

        //bu isleme de unboxing denir
        //soru: Primitive char i wrapper Character e ceviriniz?

        char priChar = 'C';
        Character priWrapper = priChar;
        //soru: wrapper boolean i primitive boolean a ceviriniz?

        Boolean isOld = true;
        boolean isOldPri = isOld;




    }
}
