package day43lambda;

public class Course {
/* NOTE:icinde
 1-private variableslar
 2-Consturctorlar(parametreli ve parametresiz)
 3-getter lar
 4-setter lar
 5-toString methodu(). tum bunlari barindiran class lara "POJO" class denir.
 Acilimi "Plain Old Java Object"
 Course class'ini POJO class olarak olusturduk. Course kalibimizi bu class icinde object olusturarak kullanacagiz.

Course turkishDay=new Course("Trukish Daytime QA", 213, "Spring", 97);
Course turkishNight=new Course("Trukish Nighttime QA", 245, "Winter", 98);
Course englishDay=new Course("English Daytime Java Dev", 121, "Spring", 91);
Course englishNight=new Course("English Nighttime Java Dev", 137, "Winter", 95);

Objectlerin parametrelerini Course class'indaki parametreli constructor'in parametrelerine uygun sekilde yerlestirdik.

Daha sonra Course ismi ile bir List olusturduk. Listin data type'i Course da olabilir.
Listimize add methodu ile elemanlar ekledik.

Example 1:Tum average scorelarin 90'dan buyuk olup olmadigini kontrol eden metodu olusturun.

metot olusturmak icin public static yazmaliyiz. Bu metot bize 90'dan buyukler ya da degiller diyecek. Bu yuzden
metodumuz boolean olur. parametre olarak int avg seklinde yazarak kodumuzu reuseable yaptik. Verilen sayi
neyse avg yerine o sayi konulur. Sayi degisse de kodumuz tekrar kullanilabilir.

Bu metod ayni zamanda bir list istiyor. Cunku kurslarimiz bir list icinde. parametre olarak once List<Course> courseList
sonra int avg'yi koyduk.

metod icine sirasiyla return courseList.stream().allMatch(t->t.getAveraageScore()>avg); yazip main
method icinde kodumuzu calistirdik. Bize true verdi. Cunku object parametreleri 90'dan buyuktu.

stream metodu ile 4 objectimizin parametrelerinden 1. olani yan yana ve digerleri alt tarafta 1. gibi siralanacklar.
Tum average scorelar istendiginden allMatch methodu ile hepsinin average'lerine bakilacak.
getAverageScore bizim onceki class'da getter ile olusturdugumuz metod idi. Bu metodu buraya uygun oldugu icin
 aldik ve burada kullandik. getAverageSCore 90 olan avg'den buyuk mu diye bakildi.

Example 2: En az bir course isminin QA icerip icermedigini kontrol eden metodu olusturun.
metodumuz yine boolean olacak(iceriyor mu, icermiyor mu)
Metodumuz list ile calisacak ve QA dendigi icin String word'u parametre olarak metodumuz icine koyduk.
En az bir course dendigi icin anyMatch methodunu kullaniriz. anyMatch metodu icinde onceki class'da getter
metodu ile olusturdugumuz uygun olan metod getCourseName'i sectik. Nasil sectik? t. yazinca metodlar gorundu.
anyMatch(t->getCourseName().contains(word);
Daha sonra metodumuzu main metod icinde calistirdik.

Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
Kusr ismi verileceginden metodumuzu String yaptik. parametre olarak sadece List'imizi yazmamiz yeterli, cunku
list icindeki skoru en yuksek olan belirlidir ve verebilir.

metod icine sirasiyla courseList.stream.sorted(burada sorted metodlarindan ikincisini sectik, Comparator.comparing
(Course::getAverageScore) ve reversed() yazdik. Cunku tersten yazilinca skoru en yuksek olan en basa gelecek ve
biz ilk elemani isteyecegiz. reversed sonrasi findFirst() methdou ile ilk elemani alabiliriz. Son kismina
 get() yazdik. Alt kisimda
kurs adini alabilmemiz icin return course.getCourseName(); yazdik. Main metod icinde kodu calistirinca ekranda
Turkish Nighttime QA yazildi.

stream(): sirasiyla tum elemanlar alt alta yazildi.
sorted(Comparator.comparing(Course::getAverageScore): Sirasiyla skorlar alt alta su sekilde yazilacak;
91
95
97
98
reversed(): 98 olan en uste gelecek;
98
97
95
91
findFirst(): Birinci elemani alacak
get(): sadece data type'ini degistiriyor. get methodu icine 98 girmis olacak.
return course.getCourseName: Bize en yuksek skora sahip kursun ismini verdi.

Example 4: Average score'u en dusuk olan ilk iki course disindaki tum kurslari return eden metodu olusturun
return etmemiz istendi. Metodumuzun return type'i Course olabilir. Ancak birden fazla data oldugundan
List<Course> olarak data type'ini belirledik ve parametre olarak List<Course> courseList yazdik.

Metod icine sirasiyla; return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).
collect(Collectors.toList());
Ilk iki kurs disindaki dendigi icin en dusuk skora sahip ilk iki kursu atlamasi icin skip() metodunu
kullandik. Bu soru ile skip() metodu ile atlama yapildigini ogrendik.Kalan elemanlari bir listte toplamak
icin collect metodunu kullandik.

Example 5: Average score'u ustten 3. olan kursu veren metodu olusturun.
Listimizdeki ustten 3. olanin skoru 95 oldugundan bize 95'i vermeli.

Course ismi ile metodumuzu olusturduk ve icine parametre olarak Listimizi koyduk.
Sirasiyla; courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)reversed()).
skip(2).limit(1).collect(Collectors.toList()).get(0);

en yuksek skorlardan itibaren 3. olani sececegimiz icin yuksekten asagiya siralama yapilmasini saglamamiz gerekir.
Bu nedenler reversed metodunu kullaniriz. En usttekini almayacagimiz , ilk 2 elemani atlayacagimiz icin
skip(2) metodunu kullandik. Icine 2 yazarak 2 atla demis olduk. limit() metodu ile kac tane alacagimizi belirledik.
Icine 1 yazarak atlama sonrasi bir elemani, yani kalanlarin ilkini almasini istedik. Collect metodu ile
kalani list icine aldik. get(0) ilk elemani bize verdi.

Example 6: Ogrenci sayisi 150;den az olan kurslari return eden metodu olusturun.
Metodumuz parametresi olarak Listimiz ve int numOfStd yazdik.
sirasiyla; courseList.strema().filter(t->t.getNumOfStudents()<numOfStd).collect(Collectors.toList())
filter kismina 150 gibi bir rakam girmek yerine numOfStd yazdik. Boylece kullanici sayi olarak
ne girerse girsin kodumuz calisabilecek. Bizden 150'den az olanlar istendigi icin
150'den cok olanlari filter metodu ile elememiz gerekti.


 */

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

