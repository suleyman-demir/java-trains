package Egitim;

import java.util.Scanner;

public class stringSinifiOrnek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String metin= scanner.nextLine();

       /* System.out.println(metin.length());

        char karakter=metin.charAt(2);
        System.out.println(karakter);

        String substr= metin.substring(2);
        System.out.println(substr);

        String substr22= metin.substring(2,5);
        System.out.println(substr22);

        int indexbul= metin.indexOf("lam");
        System.out.println(indexbul);   //belirtilen metin veya karakterin ilk geçtiği yeri bulur


        int lastindex=metin.lastIndexOf("a");
        System.out.println(lastindex);  // belirtilen karakter veya stringin son geçtiği index

        String kucugecevir=metin.toLowerCase();
        System.out.println(kucugecevir); //tum karakterleri kucuge cevirir


        String buyugecevir=metin.toUpperCase();
        System.out.println(buyugecevir); //tum karakterleri buyuge cevirir

        String boslukkaldir= metin.trim();
        System.out.println(boslukkaldir);    // basındaki ve sonundaki bosluğu kaldırır

        String yenile=metin.replace("a","4");
        System.out.println(yenile);    // belirtilen karakteri belirtilen karaktere çevirir

       // String[] parcalar=metin.split("a"); //ifadeye gore str boler ve diziye atar
       // for (int i =0;i<= parcalar.length;i++){
       //     System.out.println(parcalar[i]);
       // }

        boolean karsilastirma=metin.equals("hello");
        System.out.println(karsilastirma);  // içerik karşılaştırma

        boolean karsilastirma2=metin.equalsIgnoreCase("hello");
        System.out.println(karsilastirma2);   // buyuk kucuk harf duyarlılığı olmadan karsılstırır

        boolean kontrol=metin.contains("al");
        System.out.println(kontrol);        //belirtilen karakter veya metnin kontrolunu yapar

        boolean baslarmi=metin.startsWith("he");
        System.out.println(baslarmi);   // onunla başlayıp başlamadığpını kontorl eder

        boolean bitermi=metin.endsWith("lo");
        System.out.println(bitermi);   // onunla bitip bitmediğini kontor eder

        */
        String a="";
        char[] parcalar=metin.toCharArray(); //ifadeye gore str boler ve diziye atar

        for (int i= parcalar.length-1;i>=0;i--){
             System.out.println(parcalar[i]);
             a+=parcalar[i];

        }
        System.out.println(a);










    }
}
