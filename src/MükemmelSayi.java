import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        int n, i, total = 0;
        //kullanıcıdan n değeri alıyoruz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();

        // kalansız bölen sayıları bulup topluyoruz
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }

        //toplam sayıya eşitse ekrana çıktıyı veriyoruz
        if (total == n) {
            System.out.println(n + " Sayısı mükemmel sayıdır");
        } else {
            System.out.println(n + " sayısı mükemmel sayı değildir");
        }
    }
}