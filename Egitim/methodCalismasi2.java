package Egitim;


import java.util.Scanner;

public class methodCalismasi2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("ad gir");
        String girilenad = scanner.nextLine();

        System.out.println("soyad gir");
        String girilensoyad = scanner.nextLine();

        StudentClassMethodCalismasi ogrenci = new StudentClassMethodCalismasi(girilenad,girilensoyad);


        System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad());


        StudentClassMethodCalismasi ogrenci2 = new StudentClassMethodCalismasi("Ahmet","Kara");

        ogrenci2.adGuncelle("abdullah");
        System.out.println(ogrenci2.getAd() + " " + ogrenci2.getSoyad());

        ogrenci2.adyaz();

    }
}
