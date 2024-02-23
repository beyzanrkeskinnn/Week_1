import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n  ;
        //satır sayısını kullanıcığımızı belittik.
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Sayısınız giriniz: ");
        n = scan.nextInt();
      //Kullanıcıdan aldığı değer kadar döngüyü çalıştırdık.
        for(int k=0; k<9; k++) {
            for (int i=0; i <n; i++) {//Yıldızlar satırda kaçar kaçar basılsın.
                System.out.print("*");
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            n--;//her seferinde yıldızımızın birer birer azalmasını sağladık
        }

    }


}