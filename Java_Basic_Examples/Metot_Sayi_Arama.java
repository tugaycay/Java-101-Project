package Java101;

public class Metot_Sayi_Arama {
    public static void SayiBulmaca(){
        int [] sayilar= new int [] {1,2,3,4,7,9,0};
        int aranacak =6;
        boolean varmi =false;// Varsayılan olarak false (sayı yokmuş gibi başlıyoruz)
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varmi=true;  // Değeri true yap (Sayı bulundu!)
                break;
            }
        }
        if (varmi){
            mesajVer("Sayi mevcuttur.");
        }
        else {
            mesajVer("Sayi mevcut değildir.");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
    public static void main(String[]args){
    SayiBulmaca();

    }

}
