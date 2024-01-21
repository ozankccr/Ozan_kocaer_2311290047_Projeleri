import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class ozan_proje_15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Denklemi giriniz: ");
            String denklem = scanner.nextLine();
            try {
                double x = hesaplaX(denklem);
                System.out.println("x = " + x);
            } catch (ScriptException e) {
                System.err.println("Geçersiz denklem. Lütfen doğru bir denklem giriniz.");
            }
            scanner.close();
        }
        private static double hesaplaX(String denklem) throws ScriptException {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            String xIleDegistirilmisDenklem = denklem.replaceAll("x", "0");
            Object result = engine.eval(xIleDegistirilmisDenklem);
            return Double.parseDouble(result.toString());}
}
