package Java101;

import java.util.Scanner;

public class Burc_Bulan_Program {
    public static void main(String[] args) {
        int gun, ay;
        Scanner a = new Scanner(System.in);
        System.out.println("Hangi Gün Doğdunuz:");
        gun = a.nextInt();
        System.out.println("Hangi Ay Doğdunuz Seçiniz : \n" +
                "1) Ocak\n" +
                "2) Şubat\n" +
                "3) Mart\n" +
                "4) Nisan\n" +
                "5) Mayıs\n" +
                "6) Haziran\n" +
                "7) Temmuz\n" +
                "8) Ağustos\n" +
                "9) Eylül\n" +
                "10) Ekim\n" +
                "11) Kasım\n" +
                "12) Aralık");
        ay = a.nextInt();

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Burcunuz: Koç");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 20)) {
            System.out.println("Burcunuz: Boğa");
        } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 20)) {
            System.out.println("Burcunuz: İkizler");
        } else if ((ay == 6 && gun >= 21) || (ay == 7 && gun <= 22)) {
            System.out.println("Burcunuz: Yengeç");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Burcunuz: Aslan");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Burcunuz: Başak");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Burcunuz: Terazi");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Burcunuz: Akrep");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Burcunuz: Yay");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 19)) {
            System.out.println("Burcunuz: Oğlak");
        } else if ((ay == 1 && gun >= 20) || (ay == 2 && gun <= 18)) {
            System.out.println("Burcunuz: Kova");
        } else if ((ay == 2 && gun >= 19) || (ay == 3 && gun <= 20)) {
            System.out.println("Burcunuz: Balık");
        }
    }
}
