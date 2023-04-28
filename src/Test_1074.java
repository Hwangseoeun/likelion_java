import java.util.Scanner;

public class Test_1074 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i=0;i<=num-1;i++){
            System.out.println(num-i);
        }

    }
}