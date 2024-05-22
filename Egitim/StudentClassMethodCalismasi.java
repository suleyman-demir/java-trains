package Egitim;

public class StudentClassMethodCalismasi {
    private String ad;
    private String soyad;

    public StudentClassMethodCalismasi(String ad, String soyad) {
        this.ad= ad;
        this.soyad= soyad;

    }

    public StudentClassMethodCalismasi() {
        System.out.println("default constructor calısdı");
        ad = "default";
        soyad="default";
    }



    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setSoyad(String soyad) {this.soyad=soyad;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public void adGuncelle(String ad){this.ad=ad;}

    public void adyaz(){
        System.out.println(ad);
    }






}

