package day_11practice;

public class C04_ConstructorParametrized {

// marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak, farli bir class'dan deger ataması yapınız ve yazdırınız

      String brand;
      String model;
      int year;
      String fuel;


    public C04_ConstructorParametrized(String brd, String mdl, int ye, String ptl) {
  //parametre degerlerinin adini ayni yapsaydik o zaman this ekleyip bu class dan oldugunu
  //belirtirdik.yani brand=brand; model=model; hem instance variable hem de parametre
  //value si ayni ise java karistirmamasi icin variable ile parametreyi, variable basina this keyword
  //ekleyerek bunun bu class in instance variable oldugunu java ya belirtmis oluruz.
      brand=brd;
      model=mdl;
      year=ye;
      fuel=ptl;


    }
}
