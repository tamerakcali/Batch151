package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class
Sets01 {
 /*1-Sets tekrarsiz elementleri(unique) depolamak istedigimizde sets classi kullaniriz.
 2-3 tane set class vardir
1-  HASHSET CLASS:en hizlisidir.(hash=benzersiz ID olusturma teknigidir.Acilimi Hashing Technique dir.
 a-elementleri rastgele siralar.
 b-bundan dolayi hizli calisir.
 c-bu class "null" i eleman olarak kabul eder.
 d-tekrarsiz element depolamak icindir
 e-tekrarli element verdigimizde hata vermez o elementi bir defa ekler.

2-LINKEDHASHSET CLASS:
a-bu class elementleri verilen siraya gore dizdiklerinden hashSet e gore yavastir.
b-tekrarsiz element depolamak icindir.
c-"null" kabul eder.

3-TREESET CLASS:
 a-elementleri alfabetik siraya(naturally order) gore dizerler.Bundan dolayi cok yavastirlar.
 b-bu class a "null" eklenemez.
 c-treeSet cok yavas oldugundan mumkun oldugunca kullanmamaya calisilir.\
  */
 public static void main(String[] args) {
  HashSet<String> hs=new HashSet<>();
  
  hs.add("Ajda");
  hs.add("Cuneyt");
  hs.add("Esra");
  hs.add("Zeki");
  hs.add("Ezel");
  hs.add("Cuneyt");
  hs.add(null);
  System.out.println("hs = " + hs);//[Zeki, Ajda, Cuneyt, Esra, Ezel] hashSet oldugu icin random siraladi.

  LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
  
  lhs.add(23);
  lhs.add(25);
  lhs.add(14);
  lhs.add(21);
  lhs.add(null);

  System.out.println("lhs = " + lhs);//yazdigimiz siraya gore dizer.
  
  LinkedHashSet<Integer> ls=new LinkedHashSet<>();

  ls.add(23);
  ls.add(29);
  ls.add(14);
  ls.add(22);
  System.out.println("ls = " + ls);
  
  lhs.retainAll(ls);
  System.out.println(lhs);//[23,14] ilk linkedHashset teki farkli elemenetleri siler.ikinciye dokunmaz yani ls ye.
  System.out.println(ls);//[23, 29, 14, 22]
  
  TreeSet<Character> ch=new TreeSet<>();
  
  ch.add('G');
  ch.add('A');
  ch.add('Z');
  ch.add('R');
  ch.add('U');
  System.out.println("ch = " + ch);//[A, G, R, U, Z]
  System.out.println(ch.headSet('R'));//[G] R den onceki R haric elementi yazdirir.
  System.out.println(ch.tailSet('G'));//[R,U,Z] G dahil sonrakileri yazdirir.
 }
}
