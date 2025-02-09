package Java101;
import java.util.Scanner;

/*
* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
* */
public class KDV_Tutar_Hesaplayan_Program {
    public static void main(String[]args){
        double fiyat,kdv;
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat Giriniz =");
        fiyat = input.nextInt();
        if(fiyat>1000){
            kdv = (fiyat * 18/100)+fiyat;
            System.out.println("KDV'li Fiyat ="+kdv);
        } else  {
            kdv = (fiyat * 8/100)+ fiyat;
            System.out.println("KDV'li Fiyat ="+kdv);
        }



    }
}
