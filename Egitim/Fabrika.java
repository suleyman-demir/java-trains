package Egitim;

public class Fabrika {
    public static void main(String[] args) {
       Araba bmw =new Araba();


        bmw.setMarka("BMW");
        bmw.setKapisayisi(4);
        bmw.setKilometre(11930);
        bmw.setUretimyili("2019");

        Araba audi=new Araba();

        //System.out.println(bmw.getKapisayisi()+" "+ bmw.getKilometre()+" "+ bmw.getModel()+" "+ bmw.getUretimyili()+" "+bmw.getMarka());
    

        Araba tofas =new Araba("Tofaş","Şahin","2000",4,345700);
        System.out.println(tofas.toString());

        Araba  fard =new Araba("fard","amarog");
        System.out.println(fard);

    }


}
