package Java101;
/*
* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
* Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
* */
import java.util.Scanner;
public class Not_Ortalaması_Hesaplayan_Program {
    public static void main(String[]args){
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik, Ortalama ;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz:");
        Matematik = input.nextInt();
        System.out.println("Fizik Notunu Giriniz:");
        Fizik = input.nextInt();
        System.out.println("Kimya Notunu Giriniz:");
        Kimya =  input.nextInt();
        System.out.println("Türkçe Notunu Giriniz:");
        Türkçe = input.nextInt();
        System.out.println("Tarih Notunu Giriniz:");
        Tarih= input.nextInt();
        System.out.println("Müzik Notunu Giriniz:");
        Müzik = input.nextInt();
        Ortalama = (Matematik+ Fizik + Kimya + Türkçe + Tarih +Müzik)/6;
        System.out.println("Not Ortalamanız:"+Ortalama);
        if (Ortalama<60){
            System.out.println("Sınıfta Kaldınız..");
        } else {
            System.out.println("Sınıfı Geçtiniz..");
        }
    }
}
