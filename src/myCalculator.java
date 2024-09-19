import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class myCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try {
                System.out.println(M.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
