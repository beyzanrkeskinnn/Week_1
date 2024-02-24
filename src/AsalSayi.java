
public class AsalSayi {
    public static void main(String[] args) {
        int sayac = 0;
        //2 ile 100 arasındaki değerler kontrol edildi
        for (int i = 2; i <= 100; i++) {
            int kontrol = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                System.out.print(i + "\n");
                sayac++;
            }

        }
    }
}
