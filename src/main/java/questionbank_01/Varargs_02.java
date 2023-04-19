package questionbank_01;

public class Varargs_02 {

    public static void m( String str, int...a){

        System.out.println(str);
        for(int i:a){
            System.out.println(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        m("Java",101,102);


    }

}
