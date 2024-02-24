import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int inp, n1 = 0, n2 = 1, total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        inp = scan.nextInt();
        System.out.println(inp + " Girdiğiniz sayının fibonacci serisi: ");
        for (int i = 1; i <= inp; i++) {
            System.out.print(n1 + " ,");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}
