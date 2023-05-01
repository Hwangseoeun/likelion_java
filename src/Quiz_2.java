import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        float sum = 0;
        int[] arr = new int[a];
        for(int i = 0; i<a; i++){
            sum += scr.nextFloat();
        }
        System.out.println(sum/4);
    }

}
