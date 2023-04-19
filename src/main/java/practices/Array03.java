package practices;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};

        int degismisArr[]=new int[arr.length];

        int idx=0;
        for(int w:arr){
            degismisArr[idx]=w*-1;
            idx++;

        }
        System.out.println(Arrays.toString(degismisArr));

    }
}
