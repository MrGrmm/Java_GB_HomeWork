package Lesson_1;


import java.util.Scanner;


public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите знак операции (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        double result = 0;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;

        }

        System.out.printf("%.3f %c %.3f = %.3f", firstNumber, operation, secondNumber, result);
    }
}