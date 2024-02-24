import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        int numberint;
        double numberdouble=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz : ");
        numberint=scan.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz : ");
        numberdouble=scan.nextDouble();

        numberint=(int)numberdouble;
        System.out.println("Tam sayın artık double"+ numberdouble);

        numberdouble=(double) numberint;
        System.out.println("Ondalıklı sayın artık double"+ numberint);

        System.out.println(numberint);

    }
}
