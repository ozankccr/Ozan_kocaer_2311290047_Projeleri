
import java.util.Scanner;
public class ozan_proje_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Denklemi girin (örneğin, ax + b = c): ");
        String denklem = scanner.nextLine();
        double a = Double.parseDouble(denklem.split("x")[0].trim());
        double b = Double.parseDouble(denklem.split("x")[1].split("=")[0].trim());
        double c = Double.parseDouble(denklem.split("=")[1].trim());
        double x = (c - b) / a;
        System.out.println("Denklemin çözümü: x = " + x);
        System.out.println("Denklemin sonucu: " + (a * x + b));

        scanner.close();
    }
}
