public class ozan_proje12 {

        public static void main(String[] args) {
            String Yazımız = "Programlama";
            int Kaydirma = 12;

            for (int i = 0; i < Kaydirma; i++) {
                String kaydirilmis = Yazımız.substring(i) + Yazımız.substring(0, i);
                System.out.println(" - " + kaydirilmis);
            }
        }
    }


