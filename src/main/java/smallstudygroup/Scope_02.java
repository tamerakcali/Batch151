package smallstudygroup;

public class Scope_02 {

    static int i;
    static int x=20;

    public static void main(String[] args) {

        int a=15;
        for(int i=0;i<3;i++){
            int b;
            System.out.println(i);//0 1 2
        }
        System.out.println("a = " + a);//15
        System.out.println(i);//0 class icindeki static int aldi,deger atanmadigi icin default degeri 0 i yazdirdi.
        int z=0;
    }

}
