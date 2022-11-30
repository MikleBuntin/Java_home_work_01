//Реализовать простой калькулятор
import java.util.Scanner;


public class Task_03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Привет! ");
        System.out.printf("Введте число 1: ");
        String input_text_1 = iScanner.nextLine();
        double number_1 = Double.parseDouble(input_text_1);
        
        System.out.printf("Введте операцию (+, -, *, /): ");
        String input_text_2 = iScanner.nextLine();
        

        System.out.printf("Введте число 2: ");
        String input_text_3 = iScanner.nextLine();
        double number_2 = Double.parseDouble(input_text_3);
        iScanner.close();
        
    }

    
}
