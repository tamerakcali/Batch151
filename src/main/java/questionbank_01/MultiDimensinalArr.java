package questionbank_01;

import java.util.Arrays;

public class MultiDimensinalArr {
    public static void main(String[] args) {
        int arr[][]={{3,2,1},{1,2,3}};
        for(int i=1;i<arr.length;i++){
            for(int k=1;k<arr[0].length;k++){
                if(arr[i][k]%2==1){
                    arr[i][k]+=arr[i][k];

                    }
                if(arr[i][k]%2==0){
                    arr[i][k]=arr[i][k]*2;
                }
            }
            System.out.println(Arrays.deepToString(arr));

            int arr1[][]={{5,12},{3,8,4},{6,3}};
            System.out.println(m(arr1));
        }

    }
    public static int m(int[][]arr1) {
        int r, c;
        int i, k = 0;
        for (r = 0; r < arr1.length; r++) {
            for (c = 0; c < arr1[0].length; c++) {
                i = arr1[r][c];
                if (i > k) {
                    k = 1;
                }
            }

        }
        return r;
    }


}






