package Egitim;

public class overloadOverrideHesapMakinasi {
   private float a;
   private float b;
   private float c;

   public overloadOverrideHesapMakinasi(float a, float b, float c) {
       this.a = a;
       this.b = b;
       this.c = c;

   }

    public overloadOverrideHesapMakinasi(int a, int b) {
       this.a=a;
       this.b=b;
    }

    public void setA(float a) {
        this.a = a;
    }
    public void setB(float b) {
       this.b = b;
    }
    public void setC(float c) {
       this.c = c;

    }

    public float getA() {
       return a;
    }
    public float getB() {
       return b;
    }
    public float getC() {
       return c;
    }

     public float topla() {
        return (a + b + c);
    }
    public float topla(float a,float b) {
       return (a+b);

    }
    public float cikar() {
       return (a - b - c);

    }
    public float cikar(float a,float b){
       return a-b;
    }

    public float carp() {
       return (a*  b * c);
    }
    public float carp(float a,float b) {
       return a*b ;
    }

    public float bolme() {
       return (a / b/ c);
    }

    public float bolme(float a,float b) {
        return (a / b);
    }






}
