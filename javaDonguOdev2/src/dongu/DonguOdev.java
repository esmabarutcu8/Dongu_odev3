package dongu;
import java.util.Scanner;
public class DonguOdev {

    public static void main(String[]args){

        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı girin:");
        sayi= input.nextInt();
        int toplam=0;
        int tane=0;
        for(int i=0;i<sayi;i++){

            if((i%3==0)&&(i%4==0)){
                toplam=toplam+i;
                tane++;

            }
        }
       System.out.println(toplam/(tane-1));
    }
}
