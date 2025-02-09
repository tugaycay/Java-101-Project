package Java101.Inheritance.Bank;
/*
* extends ler sadece bir tane classı çalıştırabilir.
* */
public class Main {
    public static void main(String[]args){


        KrediUI krediUI = new KrediUI();
      //  krediUI.KrediHesapla(new OgretmenKrediManager());
       //   krediUI.KrediHesapla(new BaseKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new Asker());

        //bunların hepsini bağladığmız için hepsi bir çalıştığı için hepsi çalışır durumda.

    }
}
