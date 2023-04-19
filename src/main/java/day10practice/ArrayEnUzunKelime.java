package day10practice;

public class ArrayEnUzunKelime {

    //verilen string array inde en uzun ve en kisa stringleri yazdiran method olusturunuz?

        static String EnUzunKelime="";
        static String EnKisaKelime="";

    public static void main(String[] args) {

        String names[]={"Furkan","Veli","Huseyin","Hakan","Ali","Ece"};
          enUzunVeEnKisaName(names);

    }

    private static void enUzunVeEnKisaName(String[] names) {
        EnKisaKelime=names[0];

        for(int i=0;i<names.length;i++){
            if(EnUzunKelime.length()<names[i].length()){
                EnUzunKelime=names[i];
                if(EnKisaKelime.length()>names[i].length()){

                    EnKisaKelime=names[i];

                }

            }
            for(int i2=0;i2<names.length;i2++){
                if(EnKisaKelime.length()==names[i].length()){
                    EnKisaKelime+=" "+names[i];

                }
                if(EnUzunKelime.length()==names[i].length()){
                    EnUzunKelime+=names[i]+" ";

                }
            }
            if (EnUzunKelime.length()==EnUzunKelime.length()-1){
                System.out.println("Arraydeki en uzun kelime : "+EnUzunKelime);
            }else System.out.println("Arraydeki en uzun kelimeler : "+EnUzunKelime);
            if (EnKisaKelime.length()==EnKisaKelime.length()-1){
                System.out.println("Arraydeki en kisa kelime : "+EnKisaKelime);
            }else System.out.println("Arraydeki en kisa kelimeler : "+EnKisaKelime);
    }
}
}
