package Egitim;

public class encapsulationClass {
    private String soyad;
    private String ad;

    public encapsulationClass(String ad, String soyad) {
        this.ad=ad;
        this.soyad = soyad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;

    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }


}
