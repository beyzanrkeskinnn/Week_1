import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        //Kullanıcıdan alacağımız değerleri tanımladık
        int number1;
        double number2 = 0;

        //değerleri aldık
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz : ");
        number1 = scan.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz : ");
        number2 = scan.nextDouble();

        //double değeri int değerine dönüştürdük
        int numberint = (int) number2;
        System.out.println("Tam sayın artık double : " + numberint);
        //int değeri double değere dönüştürdü
        double numberdouble = (double) number1;
        System.out.println("Ondalıklı sayın artık double : " + numberdouble);
    }
}
