package Java101;
import java.util.Scanner;

public class Vücut_Kitle_İndeksi_Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vücut Kitle İndeksi Hesaplama");

        double kg, boy;
        double index;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        index = kg / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
