import java.util.Scanner;

public class Class_grade {
    //프로그램의 시작점
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        int max = 0;
        int putNum;
        for(int i=0; i<5;i++){
            putNum = scanner.nextInt();
            if(max<putNum) max = putNum;
        }
        System.out.println(max);
/*
        if(num>=90){
            System.out.println("A");
        }
        else if(num>=80 && num<90){
            System.out.println("B");
        }
        else if(num>=70 && num<80) {
            System.out.println("C");
        }
        else if(num>=60 && num<70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
 */
/*
        switch(num/10){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("F");
                break;
        }
 */

    }

}
