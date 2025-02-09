package Java101.Polymorphısm.Bank;

public class BaseKrediManager {
    public  double hesapla(double tutar){
        return tutar*1.18;
    }
    public void mesaj(String mesaj){
        System.out.println( "ihtiyaç krediniz : " +mesaj);

    }}
// final ile metotları ezmektten kurtarız.
//public final double hesapla(double) hesapla fonksiyonunu kullanamyız..
