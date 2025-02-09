package Java101;
import java.util.Scanner;
//Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
public class Çift_Sayıları_Bulan_Program {
    public static void main(String[]args){
        int sayi;
        Scanner input =new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        sayi=input.nextInt();
        for(int a=1 ;a<=sayi;a++){
            if(a%2==0){
                System.out.println(a);
            }


        }



    }
}
