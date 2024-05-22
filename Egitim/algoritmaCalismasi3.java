package Egitim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class algoritmaCalismasi3 {
    public static void main(String[] args) {
        System.out.println("Metin girişi yapınız");
        Scanner scanner = new Scanner(System.in);
        String girdi = scanner.nextLine();

        List<String> liste = new ArrayList<>(List.of(girdi.split("")));

        StringBuilder tersKelime= new StringBuilder();

        //1234321
        for (int i = liste.size() - 1; i >= 0; i--) {
            tersKelime.append(liste.get(i));
        }
       String tersKelimeString =tersKelime.toString();


        if (tersKelimeString.equals(girdi)){
            System.out.println("Girdiğiniz kelime polindrom :" +tersKelimeString+"  =  "+girdi);

        }else {
            System.out.println("Girdiğiniz kelime polindrom değil :"+tersKelimeString+"  /  "+girdi);
        }


        }

}

