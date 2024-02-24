import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayısını giriniz: ");
        n1 = scan.nextInt();
        System.out.print("ikinci sayısını giriniz: ");
        n2 = scan.nextInt();
        int k = n1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println(i);
            }
            i++;

        }
        System.out.println("**********");
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println(ebob);
                break;

            }

            k--;
        }
        //ekok işlemi
        int c = 1;
        while (c <= (n1 * n2)) {
            if (c % n1 == 0 && c % n2 == 0) {
                System.out.println(c);
                break;
            }
            c++;
        }


    }
}
