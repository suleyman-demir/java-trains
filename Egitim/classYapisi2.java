package Egitim;

public class classYapisi2 {
    public static void main(String[] args) {

        classYapisi1 tanim1;
        tanim1 = new classYapisi1("fatih","okan",354534545);

        classYapisi1 sinifim =new classYapisi1("ahmet","baki",10101010);

        System.out.println("sınıfım ="+sinifim.getAd()+" "+sinifim.getSoyad()+" "+sinifim.gettcNo());

        classYapisi1 ogrenci1 = new classYapisi1("ahmet","katip");

        System.out.println(ogrenci1.getAd()+ogrenci1.getSoyad());
        System.out.println(sinifim);


    }
}
