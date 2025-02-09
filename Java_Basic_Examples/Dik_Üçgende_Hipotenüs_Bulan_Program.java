package Java101;
import java.util.Scanner;
//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
public class Dik_Üçgende_Hipotenüs_Bulan_Program {
    public static void main(String[]args){
        System.out.println("Dik Üçgende Hipotenüs Bulan Program");
        Scanner input =new Scanner(System.in);
        int a,b,hipo;
        System.out.println("1.Dik Kenarı Giriniz:");
        a = input.nextInt();
        System.out.println("2.Dik Kenarı Giriniz:");
        b =input.nextInt();
        hipo = a*a + b*b;
        System.out.println("Hipotenüs :"+ Math.sqrt(hipo));

    }
}


