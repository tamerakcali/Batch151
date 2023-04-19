package practices;

public class Q08SwitchCase {
    public static void main(String[] args) {

 //ex: Bir restoranda, müşteriler menüden yemeklerini seçerler.
        //Restoran, müşterilerin seçtiği yemeği pişirmek için bir
        //program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
        //secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
        //belirlendigi bir program yaziniz.

        String menu="Hamburger";

        switch(menu){
            case "Hamburger":
                System.out.println("Hamburger menu 200 TL");
                break;
            case"Pizza":
                System.out.println("Pizza menu 100TL");
                break;
            case"Tavuk":
                System.out.println("Tavuk menu 150TL");
            default:
                System.out.println("Sorry! not in menu");

//ex:bir arac kiralama sitesinde secilen araba markasina gore kiralama ucretlerini
//toplam odenecek fiyati gosteren code u yaziniz.
//suv=500.0
//sedan=400.0
//hatcback=300.0
//others=200.0
//double toplam ucret=kiralama ucreti*kiralanacak gun sayisi.

          String otoType="suv";

          int rentDayNum=5;
          double rentFee=0.0;
          switch(otoType){
              case "suv":
                  rentFee=500.00;
                  break;
              case "sedan":
                  rentFee=400.00;
                  break;
              case"hatchback":
                  rentFee=300.00;
                  break;
              default:
                  System.out.println("out of service");
          }
            double toplamUcret=(rentDayNum*rentFee);

 //ex:  Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
                //Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
                //gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
                //istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
                //onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
                //kontrol eden bir program yaziniz
        }
    }
}
