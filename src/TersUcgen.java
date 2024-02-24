import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n;
        //satır sayısını kullanıcadan alıyoruz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Sayısınız giriniz: ");
        n = scan.nextInt();
        //Kullanıcıdan aldığı değeri azaltarak çalıştırıyoruz
        for (int i = n; i > 0; i--) {
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}