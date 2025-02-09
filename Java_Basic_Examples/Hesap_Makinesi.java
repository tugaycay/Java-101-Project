package Java101;
import java.util.Scanner;
public class Hesap_Makinesi {
    public static void main(String[]args){
        int a, b ,select ;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        a = input.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        b = input.nextInt();
        System.out.println("Bir işlem seçiniz: \n" +
                "1)toplama\n" +
                "2)çıkarma\n" +
                "3)bölme\n" +
                "4)çarpma");
        select = input.nextInt();
        switch (select){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3 :
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
                break;
        }
    }
}
