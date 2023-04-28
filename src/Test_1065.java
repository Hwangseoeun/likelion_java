import java.util.Scanner;

public class Test_1065 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();

        if(num_1%2==0){
            System.out.println(num_1);
        }
        if(num_2%2==0){
            System.out.println(num_2);
        }
        if(num_3%2==0){
            System.out.println(num_3);
        }
    }
}
