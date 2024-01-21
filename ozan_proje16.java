import java.util.Scanner;

public class ozan_proje16 {
        public static void main(String[] args) {
            String metin = "İnsanlar doğası gereği yalnız yaşamayı beceremez. " +
                    "Daima diğer kişilere, dostlarına veya " +
                    "yakınlarına gereksinim duyar ";

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bulmak istediğin karakteri giriniz: ");

            char arananKarakter = scanner.next().charAt(0);
            int karakterSayisi = sayac(metin, arananKarakter);
            System.out.println("Metin içinde '" + arananKarakter + "' karakteri " + karakterSayisi + " kez bulunmaktadır.");
            scanner.close();
        }
        private static int sayac(String metin, char arananKarakter) {
            int sayac = 0;
            for (int i = 0; i < metin.length(); i++) {
                if (metin.charAt(i) == arananKarakter) {
                    sayac++;
                }
            }
            return sayac;
        }
    }


