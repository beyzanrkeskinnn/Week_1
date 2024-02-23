import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n  ;
        //satır sayısını kullanıcığımızı belittik.
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Sayısınız giriniz: ");
        n = scan.nextInt();
      //Kullanıcıdan aldığı değer kadar döngüyü çalıştırdık.
        for (int i = n; i>=1 ; i--) {

            //Boşluklar
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Yıldızlar
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();

        }

    }


}