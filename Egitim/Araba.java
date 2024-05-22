package Egitim;

public class Araba {

    private String model;
    private Integer kilometre;
    private int kapisayisi;
    private String uretimyili;
    private String marka;

    public Araba(String marka, String model) {
        this(marka, model, null, 0, null);
    }


    public Araba() {
        System.out.println("default constructor calısdı");
        marka = "default";
    }

    public Araba(String marka, String model, String uretimyili, int kapisayisi, Integer kilometre) {
        this.marka = marka;
        this.kapisayisi = kapisayisi;
        this.kilometre = kilometre;
        this.model = model;
        this.uretimyili = uretimyili;
    }

    private Araba(String model){
        this.model=model;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka.trim().length() < 1) {
            return;
        }

        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private Integer getKilometre() {
        return kilometre;
    }

    public void setKilometre(Integer kilometre) {
        this.kilometre = kilometre;
    }

    public int getKapisayisi() {
        return kapisayisi;
    }

    public void setKapisayisi(int kapisayisi) {
        if (kapisayisi < 1) return;
        this.kapisayisi = kapisayisi;
    }

    public String getUretimyili() {
        return uretimyili;
    }

    public void setUretimyili(String uretimyili) {
        this.uretimyili = uretimyili;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", kilometre=" + kilometre +
                ", kapisayisi=" + kapisayisi +
                ", uretimyili='" + uretimyili + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}

