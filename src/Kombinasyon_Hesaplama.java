import java.util.Scanner;

public class Kombinasyon_Hesaplama {

    public static void main(String[] args) {

        int n,r,faktoriyel_1=1 , faktoriyel_2=1, faktoriyel_3=1 ;


        Scanner klavye=new Scanner(System.in);
        System.out.println("N Değerini Giriniz");
        n=klavye.nextInt();

        System.out.println("R Değerini Giriniz");
         r=klavye.nextInt();
        

        for(int i=1;i<=n;i++){ //n sayısının faktöriyeli hesaplandı

            faktoriyel_1=faktoriyel_1*i;
        }

        for(int j=1;j<=r;j++){ //r sayısının faktöriyeli hesaplandı

            faktoriyel_2=faktoriyel_2*j;
        }
        int fark=n-r; //n ve r farkını hesapla
        for(int k=1;k<=fark;k++){

            faktoriyel_3=faktoriyel_3*k;
        }

        int carpim=faktoriyel_2*faktoriyel_3;
        int kombinasyon=faktoriyel_1/carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }

}
