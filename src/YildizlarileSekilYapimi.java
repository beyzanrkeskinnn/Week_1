import java.util.Scanner;

public class YildizlarileSekilYapimi {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Satır Sayısınız giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int m = 1; m <= n - 1; m++) {
            for (int b = 1; b <= m; b++) {
                System.out.print(" ");
            }

            for (int z = m * 2 + 1; z <= (2 * n) - 1; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }


}