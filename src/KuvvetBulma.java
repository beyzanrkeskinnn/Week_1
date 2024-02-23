import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <=n; i*=4) {

            System.out.println(i);
        }
}
}
