import java.util.Scanner;

public class Arr {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            for (int i = c.length - 1; i >= 0; i--) {
                System.out.print(c[i]);
            }
    }

}
