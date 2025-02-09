package Java101.Polymorphısm.Bank;

public class Main {
    public static void main(String[]arguments){

        BaseKrediManager [] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
        for( BaseKrediManager krediManager : krediManagers){
           System.out.println(krediManager.hesapla(2));
        }

    }
}
