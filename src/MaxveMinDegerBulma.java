import java.util.Scanner;

public class MaxveMinDegerBulma {
    public static void main(String[] args) {
        int n, min = 0, max = 0, inpnumber;

        //kullanıcıdan n kadar değer aldık
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scan.nextInt();

        //n değerinden küçük ve eşit olana kadar artarak gidecek şekilde tanımladık
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            inpnumber = scan.nextInt();
            if (i == 1) {
                min = inpnumber;
                max = inpnumber;
            } else {
                if (inpnumber > max) max = inpnumber; //en büyük değeri atadık
                if (inpnumber < min) min = inpnumber; //en küçük değeri atadık

            }
        }
        System.out.println("Girilen sayılar arasında en büyük sayı : " + max);
        System.out.println("Girilen sayılar arsında en küçük sayı : " + min);
    }
}