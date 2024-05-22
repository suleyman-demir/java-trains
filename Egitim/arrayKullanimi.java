package Egitim;

import java.util.Scanner;

public class arrayKullanimi {
    public static void main(String[] args) {
        Scanner girdi0=new Scanner(System.in);

   String[] hayvanlar=new String[13];
     //   System.out.println("Kaç adet Hayvan satacaksınız ? : ");
     //  int girdi3= girdi0.nextInt();


    /*  int x=girdi3+1;
        System.out.println("satmak istediğiniz hayvan isimlerini yazınız : ");
      for(int i=0;i<x;i++){

          String girdi=girdi0.nextLine();

          hayvanlar[i]=girdi;

      }     */

      hayvanlar[0]="eşek";
      hayvanlar[1]="köpek";
      hayvanlar[2]="kedi";
      hayvanlar[3]="sülük";


        System.out.println(hayvanlar[0]+hayvanlar[3]);
        System.out.println(hayvanlar.length);
        hayvanlar[0].split("e");
        System.out.println(hayvanlar[0]);


        int matrix[][];
        int [][] sayilar={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}

        };

        System.out.println(sayilar[0][1]);









    }
}
