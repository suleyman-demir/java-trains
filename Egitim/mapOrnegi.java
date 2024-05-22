package Egitim;

import java.util.*;

public class mapOrnegi {
    public static void main(String[] args) {
        Map<Integer,Integer> map =new HashMap<>();
        map.put(1001,55);
        map.put(1002,97);
        map.put(1003,32);
        map.put(1004,75);
        map.put(1005,20);


        List<Integer> listee=new ArrayList<>(map.values());

        Collections.sort(listee, Collections.reverseOrder());

        int ortalama=0 ;
        System.out.println(Collections.max(listee));
        System.out.println(Collections.min(listee));
        for (int num:listee){

          ortalama+= num;

        }
        System.out.println((double) ortalama/listee.size());


        System.out.println("Silmek istediğiniz öğrencinin numarasını yazınız, Öğrenciler : "+map);
        Scanner scanner=new Scanner(System.in);
        Integer girdi=scanner.nextInt();
        map.remove(girdi);
        System.out.println("İstediğiniz kayıt kaldırıldı : " +map);
        System.out.println("Güncellemek istediğiniz öğrenci numarasını giriniz : " +map);
        Integer girdi2=scanner.nextInt();
        System.out.println("güncellemek istediğiniz yeni notu giriniz ");
        Integer girdi3=scanner.nextInt();

        map.replace(girdi2,girdi3);
        System.out.println(map);

        boolean check1 = map.containsKey(1001);
        System.out.println(check1);

        boolean check2 = map.containsValue(75);
        System.out.println(check2);

        System.out.println(map.size());

        int check4=map.getOrDefault(10019,000);

        System.out.println(check4);

        int check5= map.replace(1001,99);

        System.out.println(map.get(1001));










    }
}
