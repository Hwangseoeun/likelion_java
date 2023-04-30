import java.util.Scanner;

public class Test_1079 {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        while(true){
            String s = scanner.nextLine();
            char c = s.charAt(0);
            if (c=='q'){
                break;
            }
            else{
                System.out.println(c);
            }
        }

    }
}