package Egitim;

import java.util.Scanner;

public class encapsulationTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Öğrenci adını giriniz :");
        String ad = sc.nextLine();
        ad = ad.toUpperCase();
        System.out.println("Soyad giriniz");
        String soyad = sc.nextLine();
        soyad = soyad.toUpperCase();
        encapsulationClass ogrenci=new encapsulationClass(ad,soyad);
        System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad());
    }
}
