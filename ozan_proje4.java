public class ozan_proje4 {
        public static void main(String[] args) {
            ucgenOlustur1den5e();
            ucgenOlustur4ten1e();
        }
        public static void ucgenOlustur1den5e() {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void ucgenOlustur4ten1e() {
            for (int i = 4; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
