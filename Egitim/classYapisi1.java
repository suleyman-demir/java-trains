package Egitim;

public class classYapisi1 {

    private String ad;
    private String soyad;
    private Integer tcNo;




    public classYapisi1(String ad,String soyad,Integer tcNo){
        this.ad=ad;
        this.soyad=soyad;
        this.tcNo=tcNo;
    }

    public classYapisi1(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }


    public void setAd(String ad){
        this.ad=ad;
    }
    private void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    private void setTcNo(int tcNo){
        this.tcNo=tcNo;
    }
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public Integer gettcNo(){return tcNo;}


    public String toString(){
        return ad + " " + soyad + " " + tcNo;
    }
}
