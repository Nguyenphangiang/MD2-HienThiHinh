import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Draw rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 2 :
                System.out.println("Draw square triangle");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                for (int i = 6; i >=1 ; i--) {
                    for (int j = 1; j <i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 3 :
                int k =0;
                for (int i = 1; i <=5; i++,k=0) {
                    for (int j = 1; j <= 5-i ; ++j) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1){
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
                break;
        }
    }
}
