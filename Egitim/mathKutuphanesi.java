package Egitim;

public class mathKutuphanesi {
    public static void main(String[] args) {
        int a=100;
        int b=13;
        int c=145;
        double d=14.2;

       int max= Math.max(a,b);

        System.out.println(max);

        int min=Math.min(a,c);
        System.out.println(min);

        int mutlakdeger= Math.abs(c);
        System.out.println(mutlakdeger);

        double üssü=Math.pow(a,b);
        System.out.println(üssü);

        double kok=Math.sqrt((double) c);
        System.out.println(kok);

        double kupkok=Math.cbrt(c);
        System.out.println(kupkok);

        double yuvarla=Math.floor(d);
        System.out.println(yuvarla);


        double yuvarla1=Math.ceil(d);
        System.out.println(yuvarla1);

        double sıfırat=Math.round(d);
        System.out.println(sıfırat);

    }
}
