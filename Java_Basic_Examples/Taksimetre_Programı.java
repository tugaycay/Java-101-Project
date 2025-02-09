package Java101;
/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;
public class Taksimetre_Programı {
    public static void main(String[]args){
    System.out.println("Taksimetre Programı");
    double KM,tutar;
    Scanner input =new Scanner(System.in);
    System.out.print("Kaç KM yol gittiniz:");
    KM = input.nextInt();
    tutar =KM * 2.20 ;
    if(tutar<20){
        System.out.println("Ödenecek tutar 20 Tldir.");
    }else {
        System.out.println("Ödenecek tutar : "+tutar);
    }

    }

}
