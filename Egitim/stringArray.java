package Egitim;

import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Metninizi Virgüller Aracılığı ile Bölerek Yazınız");
        String girdi1=girdi.nextLine();
        String[] cumle = girdi1.split(",");

        for (String kelime: cumle){
            System.out.println(kelime);
        }
        System.out.println(cumle.length);
        System.out.println(cumle[2]);


    }
}
