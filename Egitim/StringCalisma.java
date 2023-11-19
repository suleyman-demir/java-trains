package Egitim;

public class StringCalisma {

    public static void main(String[] args) {
        String yazi = "selam nasılsın";
        yazi.length();
        yazi.charAt(0);
        yazi.toLowerCase();
        yazi.toUpperCase();
        yazi.substring(3);
        yazi.substring(3,10);
        yazi.concat(" sonuna birleştirilecek metin");
        yazi.contains("nasılsın");
        yazi.endsWith("sın");


        yazi.startsWith("sel");
        yazi.indexOf("lam");
        yazi.isEmpty();
        yazi.replace("s","x");
        yazi.split(" ");
        yazi.equals("karşilatirialcak metin");
        yazi.trim();
        yazi.repeat(3);
        System.out.println(yazi.substring(4,10));


        StringCalisma.mesajYazdir("naber");
    }

    public static void yazdir() {
        System.out.println("yazdırdım.");
    }

    public static String mesajYazdir(String mesaj) {
        System.out.println("mesajiniz:" + mesaj);
        return "yazdirdim.";
    }

    public String uret() {
        return "paket";
    }
}
