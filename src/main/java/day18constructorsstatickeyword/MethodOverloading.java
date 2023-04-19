package day18constructorsstatickeyword;

public class MethodOverloading {
    public static void main(String[] args) {
        //1-ayni methodu farkli parametrelerle kullanmaya overloading method denir.
        //2- Method overloading javada iyi organizasyon icin onemlidir.
        //3-parametre 3 sekilde degistirilebilir.
        //a-parametrelerin sayilari degistirilebilir.
        //b-parametrelerin data typleri degistirebilirsiniz.
        //c-parametrelerin farkli ise,data type lerin yerleri degistirilebilir.
        //d-methodoverloading bir class in icinde olusur.bu yuzden private methods da
        //overload edilebilir.
        //e-static methods overload edilebilir.
     }
        public static int add ( int a, int b, int c) {
            return a + b + c;

         }
        public static double add ( double a, int b) {
            return a + b;
         }
    }



