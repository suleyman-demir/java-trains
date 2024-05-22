package Egitim;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringKutuphanesi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        // Tüm harflerin frekansını tutmak için bir HashMap kullanıyoruz
        HashMap<Character, Integer> harfSayisi = new HashMap<>();

        // Cümledeki her harfi kontrol ediyoruz
        for (char ch : cumle.toCharArray()) {
            // Sadece harfleri kontrol etmek için
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Harfleri küçük harfe çeviriyoruz
                harfSayisi.put(ch, harfSayisi.getOrDefault(ch, 0) + 1);
            }
        }

        char enCokGecenHarf = ' ';
        int maxSayisi = 0;

        for (Map.Entry<Character, Integer> entry : harfSayisi.entrySet()) {
            if (entry.getValue() > maxSayisi) {
                enCokGecenHarf = entry.getKey();
                maxSayisi = entry.getValue();
            }
        }

        System.out.println("En çok geçen harf: " + enCokGecenHarf + " (" + maxSayisi + " kez)");
    }
    }

