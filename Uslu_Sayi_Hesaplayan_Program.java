package Java101;

import java.util.Scanner;

public class Uslu_Sayi_Hesaplayan_Program {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b ;
        System.out.print("Taban giriniz :");
        a= input.nextInt();
        System.out.print("Üs giriniz :");
        b=input.nextInt();
        int total=1;
        int i=1;
        /*
        while(i<=b){
            total *=a;
            i++;
        }
        System.out.print("Cevap : "+ total);
*/
        for (int l=1;l<=b;l++){
            total = total *a ;
        }System.out.print(total);



    }
}
