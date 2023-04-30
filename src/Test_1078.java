import java.util.Scanner;
public class Test_1078 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int score = 0;

        for(int i=0; i<=num; i++){
            if(i%2==0){
                score = score + i;
            }
        }
        System.out.println(score);
    }
}