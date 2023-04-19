package practices09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopping {


    static Scanner input=new Scanner(System.in);

    static List<String> artikelList=new ArrayList<>();
    static List<Double> artikelPrices=new ArrayList<>();
    static double totalPayment;
    static int isContinue;
    static double needPayment;


    public static void main(String[] args) {

        /*
         * Online alisveris programi yaziniz.

         * 1. Adim : "urunListesi" ve "urunFiyatlari" listesi olustur.
         * 2. Adim : olusturdugun urunListesine 3 urun daha ekle.
         * 3. Adim : "urunListesi"nden urun sectirdigin ve kac adet istedigini
         *            sordugun bir musteriSecim () olustur.
         * 4. Adim : Kullaniciya urunListesini goster
         *           Urun kodunu ve kac adet istedigini sor
         *           Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam odemesi gereken tutari
         *           eger kurulus gunune denk geldiyse "Borcunuz Yoktur" ,
         *           kurulus gunune denk gelmediyse toplam Tutari goster,
         *           baska urun almak istiyorsa tekrar urun sectir.     *
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 5. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme"ye ekle.
         * 6. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

         * */

        artikelList.add("Watch artikel code 0");
        artikelList.add("Monitor artikel code1");
        artikelList.add("Canta artukel code 2");
        artikelList.add("Tv artikel code 3");
        artikelList.add("Boek artikel code 4");

        artikelPrices.add(150.0);
        artikelPrices.add(3000.0);
        artikelPrices.add(5000.0);
        artikelPrices.add(6000.0);
        artikelPrices.add(100.0);

        List<String> newArtikels=new ArrayList<>();

        newArtikels.add("Julery artikel code 5");
        newArtikels.add("Tencere artikel code6");
        newArtikels.add("Cloth artikel code 7");
        artikelList.addAll(newArtikels);

        List<Double> newArtikelPrices=new ArrayList<>();

        newArtikelPrices.add(400.0);
        newArtikelPrices.add(200.0);
        newArtikelPrices.add(9000.0);
        artikelPrices.addAll(newArtikelPrices);
        customerSelect();

    }

    public static void customerSelect(){

        System.out.println("Please enter a artikel code");
        int artikelCode=input.nextInt();

        if(artikelCode>=0 && artikelCode<=artikelList.size()){
            System.out.println("please enter code");
            int quan=input.nextInt();
            double totalArtikelPrice=artikelPrices.get(artikelCode)*quan;
            totalPayment += totalArtikelPrice;
  //           isContinue;
        }else{
            System.out.println("Please enter a valid code");
            customerSelect();//Recursive method,tekrar tekrar method cagirmak.
        }

    }//customer select curly



    public static void isContinue(){
        System.out.println("Would you like  shopping"+
                "\n if yes=1\nif no=2 press number");
        int isContinue=input.nextInt();

           if(isContinue==1){
               customerSelect();
           }else if(isContinue==2) {
               pay();

           } else{
               System.out.println("Please enter a valid selection");
               int isContinue1 = isContinue;


           }


                }
    private static void pay() {
        LocalDate establishDate=LocalDate.of(2020,4,9);//burda sadece ay ve gunu compare eder.

        LocalDate currentDate=LocalDate.now();
        if(currentDate.equals(establishDate)){
            System.out.println("Establish day not need to pay");

        }else{
            System.out.println("Thank you for selecting us");
            System.out.println(needPayment+"€");
        }

            }
    public static void artikelLIstShow() {
        System.out.println("********artikelList*******");
        for(int i=0;i<artikelList.size();i++){
            System.out.println(i+"-"+artikelList.get(i)+"Price"+artikelPrices.get(i)+"€");

        }



}


        }









