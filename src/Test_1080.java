import java.util.Scanner;

public class Test_1080 {
    public static void main(String[] args){
        java.util.Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;
        int i;
        for (i=1;i<=num;i++){
            sum = sum+i;
            if(sum>=num){
                break;
            }
        }
        System.out.println(i);
    }
}