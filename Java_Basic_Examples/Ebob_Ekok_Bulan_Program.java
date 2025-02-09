package Java101;
import java.util.Scanner;

public class Ebob_Ekok_Bulan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        int min = Math.min(num1, num2); //ebob hiç bir zaman büyük sayıdan büyük olmaz.
        int ebob = 0;

        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
        }

        int ekok = (num1 * num2) / ebob; // EKOK hesaplama formülü

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
