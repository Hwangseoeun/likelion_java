import java.util.Scanner;

public class Test_1064 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();

        int min = num_1 < num_2 ? num_1 : num_2;
        min = min < num_3 ? min : num_3;
        System.out.println(min);

    }
}
