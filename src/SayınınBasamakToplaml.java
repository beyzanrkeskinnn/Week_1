
import java.util.Scanner;
public class SayınınBasamakToplaml {
    public static void main(String[] args) {
        int num, adet = 0, total=0;
            // Kullanıcıdan girdi al.
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir Sayı Girin: ");
             num = scan.nextInt();


            while(num != 0)
            {
                total=(num%10)+total;
                num /= 10;
                ++adet;
            }

            System.out.println("Basamak Toplamı: " + total);
        }
    }

