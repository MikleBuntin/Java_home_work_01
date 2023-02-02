// Вычислить n-ое треугольного число(сумма чисел от 1 до n)
// или n! (произведение чисел от 1 до n)

/**
 * program
 */

import java.util.Scanner;

 public class Task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введте число: ");
        String input_text = iScanner.nextLine();
        int number = Integer.parseInt(input_text);
        iScanner.close();
                
        int count = 0;
        int sum = 0;
        while (count <= number) {
            sum += count;
            count++;
        }
        System.out.printf("%s-е треугольное число = %s \n", number, sum);
    }
}
