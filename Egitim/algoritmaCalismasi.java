package Egitim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algoritmaCalismasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String girdi = scanner.nextLine();

        List<String> liste = new ArrayList<>(List.of(girdi.split(" ")));
        String kkelime = "";

        for (int i = 0; i < liste.size(); i++) {

            char[] arr = liste.get(i).toCharArray();
            arr[0] = String.valueOf(arr[0]).toUpperCase().charAt(0);

            kkelime = kkelime.concat(new String(arr)).concat(" ");
        }

        System.out.println(kkelime);


    }
}
