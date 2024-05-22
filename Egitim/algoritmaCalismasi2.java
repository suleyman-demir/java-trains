package Egitim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algoritmaCalismasi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girdi = scanner.nextLine();

        List<String> liste = new ArrayList<>(List.of(girdi.split(" ")));
        List<String> listeCoklu = new ArrayList<>();


        for (int i = 0; i < liste.size(); i++) {
            if (listeCoklu.contains(liste.get(i).toLowerCase())) {
                System.out.println(liste.get(i) + " - ilk tekrar eden");
                break;
            } else {
                listeCoklu.add(liste.get(i).toLowerCase());

            }
        }
    }
}
