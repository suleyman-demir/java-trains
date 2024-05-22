package Egitim;

import java.util.*;

public class arrayListOrnegi {
    public static void main(String[] args) {

      //  List<Integer> sayilar1 = new ArrayList<>(Arrays.asList(2,2,4));
      //  sayilar1.removeAll(Collections.singleton(2));
      // tüm kayıtları silmek için bu kullanılır


        List<Integer> sayilar = new ArrayList<>();
        List<Integer> sayilar2 = new ArrayList<>();
        Random randomsayilar = new Random();


        for (int x = 0; x < 10; x++) {
            int randomsayi = randomsayilar.nextInt(10);
            sayilar.add(randomsayi);
        }


        System.out.println("Sayilar Listesi:");
        for (int num : sayilar) {
            System.out.println(num);
        }

        for (int z = 0; z < 10; z++) {
            int randomsayi = randomsayilar.nextInt(10);
            sayilar2.add(randomsayi);
        }

        sayilar2.remove(Integer.valueOf(2));
        System.out.println("Sayilar2 Listesi:");
        for (int num : sayilar2) {
            System.out.println(num);
        }


        System.out.println("Aynı olan sayılar:");
        for (int c = 0; c < sayilar.size(); c++) {
            if (sayilar2.contains(sayilar.get(c))) {
                System.out.println("Sayılar aynı: " + sayilar.get(c));
            }
        }

        System.out.println("Sayilar listesinde olup Sayilar2 listesinde olmayan sayılar:");
        for (int num : sayilar) {
            if (!sayilar2.contains(num)) {
                System.out.println(num);
            }
        }


        sayilar.add(12);
        System.out.println(sayilar.get(sayilar.size() - 1));
        //bu şekilde de yazılabilir System.out.println(sayilar.get(Integer.valueOf(12)));

        boolean kontrol = sayilar.contains(3);
        System.out.println(kontrol);

        System.out.println(sayilar.size());

        boolean kaldir = sayilar.remove(Integer.valueOf(4));
        System.out.println(kaldir);
        //listede bulunan ilk değeri kaldırır

        sayilar.removeAll(sayilar2);
        //sayılar ikideki hepsini sayılar birden kaldırır

        sayilar2.addAll(sayilar);
        //sayılar2nin sonuna sayiların tümünü ekledik bir nevi birlşetirdik

        boolean checkk = sayilar.isEmpty();
        //boş mu

        // sayilar.clear();

        boolean karsilastirma = sayilar.containsAll(sayilar2);
        //sayılar arrayındaki sayıların tümünün sayılar ikide olup olmadığına bakar

        int kontroll = sayilar.indexOf(4);
        //sayıalrın içindeki 4 elementinin kaçıncı indexte oldupunu söyler ilk geçtiği

        int kontrollll = sayilar.indexOf(5);
        //sayıalrın içindeki 5 elementinin kaçıncı indexte oldupunu söyler son geçtiği

        sayilar.set(2, 6);
        //2 yi 6 ya çevirir

        List<Integer>sayilar33=sayilar.subList(2,7);
        //sayılar33 adında sayılar listinin 2.indexinden 7. indexine kadar olan elamanları alan bir list oluşturur

        Object dizi=sayilar2.toArray();
        //dizi adında sayılar2 yi yapar




    }
}
