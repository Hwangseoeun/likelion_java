import java.util.Scanner;

public class Test_1063 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();

        if(num_1>num_2){
            System.out.println(num_1);
        }
        else{
            System.out.println(num_2);
        }
    }

}
