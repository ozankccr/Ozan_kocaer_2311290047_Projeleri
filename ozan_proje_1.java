import java.util.Random;
import java.util.Scanner;

public class ozan_proje_1 {
        public static void main(String[] args) {
            Random rand = new Random();
            int rastgeleSayilar = rand.nextInt(100) + 1;

            int tahminet;
            int denemeSayisi = 0;
            boolean bulundu = false;

            Scanner scanner = new Scanner(System.in);

            System.out.println("1 ve 100 Arasında Bir Sayı Tahmin Et  = ");

            while (!bulundu) {

                tahminet = scanner.nextInt();
                denemeSayisi++;

                if (tahminet == rastgeleSayilar) {
                    bulundu = true;
                    System.out.println("Buldun Maşallah " + denemeSayisi + " Denemede sayıyı Suldunuz.");
                } else {

                    String kontrol = (tahminet < rastgeleSayilar) ? "Daha büyük bir sayı gir." : "Daha küçük bir sayı gir.";
                    System.out.println(kontrol);
                }
            }

            scanner.close();
        }
    }


