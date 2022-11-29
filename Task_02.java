// Вывести все простые числа от 1 до 1000 

//import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_02 {
    
//    private static final LocalDateTime.now();

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введте число: ");
        String input_text = iScanner.nextLine();
        int number = Integer.parseInt(input_text);
        iScanner.close();
        
        //int[] numbers_array = new int [] {1};
        ArrayList<Integer> numbers_array = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            for (int j = 0; j < numbers_array.size(); j++){
                if (i % numbers_array.get(j) == 0) {
                    break;
                }
                
            }
            numbers_array.add(i);
            
            
        }
        System.out.println(numbers_array);
        
    }
    
}
