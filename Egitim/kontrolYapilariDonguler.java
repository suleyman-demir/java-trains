package Egitim;

import java.util.Random;

public class kontrolYapilariDonguler {

    public static void main(String[] args) {
/*
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(6) + 1;
        System.out.println("Lütfen 1-6 arası bir rakam giriniz " +
                "3 tercih hakkınız var");

        Scanner tahmin = new Scanner(System.in);
        int tahminhakki = 3;*/



        int i=0;
        for(;i<1000;i++){

            System.out.println(i++);

            if (i<=new Random().nextInt()) break;
        }
        System.out.println(i);



      /*  int i=0;
        for (; ;){
            System.out.println(i++);
            if(i==5) break;
        }

        */




     /*  for (tahminhakki=2;tahminhakki>=0;tahminhakki--){
            int sayiTahmini=tahmin.nextInt();
            if (sayi == sayiTahmini){

                System.out.println("Tahmininiz Doğru Tebrikler " +
                        "Sayı = "+sayi);
                        break;
            }else {
                System.out.println("Tahmininiz yanlış Kalan hakkınız : "+tahminhakki);
            }
        }   */

    /*          do {
            int sayiTahmini = tahmin.nextInt();
            if (sayi == sayiTahmini) {

                System.out.println("Tahmininiz Doğru Tebrikler " +
                        "Sayı = " + sayi);
                break;
            }else {tahminhakki--;
                System.out.println("Tahmininiz yanlış Kalan hakkınız : " + tahminhakki);
            }
        }while (tahminhakki>0); */



    }

}