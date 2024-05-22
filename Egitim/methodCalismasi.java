package Egitim;

import java.util.Scanner;

public class methodCalismasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayı girişi yapınız : ");
        int girdi = scanner.nextInt();

        System.out.println("Yapmak İstediğiniz Aritmetik İşlem Nedir : ");
        String islem = scanner.next();


        System.out.println("2. sayı girişi yapınız : ");
        int girdi2 = scanner.nextInt();

        HesapMakinasi makina = new HesapMakinasi();


        switch (islem) {
            case "+" -> System.out.println(makina.toplama(girdi, girdi2));
            case "-" -> System.out.println(makina.cikarma(girdi, girdi2));
            case "*" -> System.out.println(makina.carpmaIslemi(girdi, girdi2));
            case "/" -> System.out.println(makina.bolme(girdi, girdi2));

        }


    }


}



