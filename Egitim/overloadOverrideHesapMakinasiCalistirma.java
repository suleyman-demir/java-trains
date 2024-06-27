package Egitim;

public class overloadOverrideHesapMakinasiCalistirma {
    public static void main(String[] args) {
        overloadOverrideHesapMakinasi islem=new overloadOverrideHesapMakinasi(32,54,13);
        System.out.println(islem.topla());
        System.out.println(islem.topla(32f,32f)+"iki sayının toplamı");
        System.out.println(islem.cikar(32f,32f)+"iki sayının çıkarması");
        System.out.println(islem.carp(32f,32f)+"iki sayının çarpım");
        System.out.println(islem.bolme(32,32)+"iki sayının bölüm");
        System.out.println(islem.topla()+"üç sayının toplam");
        System.out.println(islem.carp()+"üç sayının çarpım");
        System.out.println(islem.bolme()+"üç sayının bölüm");
        System.out.println(islem.cikar()+"üç sayının çıkarması");


    }
}
