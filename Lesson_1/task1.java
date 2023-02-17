package Lesson_1;


/**
 * task1
 */

 import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        scanner.close();

        int triangleNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
            factorial *= i;
        }

        System.out.println("Triangle number of " + n + " is " + triangleNumber);
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
