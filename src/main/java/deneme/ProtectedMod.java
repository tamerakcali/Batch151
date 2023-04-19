package deneme;

import day13_practices.C03_Varargs;

public class ProtectedMod extends C03_Varargs {

 //protected yaparak cagiracaz farkli bir package ve class da.

    public static void main(String[] args) {

        String ad="Cihan";
        String ad1="Suleyman";

        System.out.println(C03_Varargs.longestWord(ad,ad1));//parent child iliskisi varsa method cagirirken
                                                           //class ismi yazilmadan da cagrilabilir.


    }


}
