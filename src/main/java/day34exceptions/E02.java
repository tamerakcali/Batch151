package day34exceptions;

public class E02 {

    public static void main(String[] args) {
        String a[]={"A","V","A","J"};
        System.out.println(getElement(a,3));
        System.out.println(getElement(a,6));//exception aliriz
        System.out.println(getElement(a,-3));
    }

 //bir string array den istenilen bir elementi element sirasi ile alan method olusturun?

 public static String getElement(String[] a,int numOfElement){

  //   return a[numOfElement-1];//3. elemen index de 2 nci oldugu icin 2 yi almak icin -1 yapiyoruz.

       String result="";
     try{
         result=a[numOfElement-1];
     }catch(ArrayIndexOutOfBoundsException e){//bu exception array islemlerinde olmayan index kullanildiginda
                                             //throw edilir.

         if(numOfElement-1<0){
             result=a[0];

         }else{
             result=a[a.length-1];
         }

     }
     return result;
 }


}
