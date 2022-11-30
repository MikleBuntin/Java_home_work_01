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
        numbers_array.add(1);
        //numbers_array.add(2);
        for (int i = 2; i <= number; i++) {
            // System.out.printf("i = %s. \n", i);
            int count = 0;
            for (int j = 0; j < numbers_array.size(); j++){
                //System.out.printf("j = %s. \n", j);
                if (i % numbers_array.get(j) == 0) {
                    count++;
                    //System.out.printf("i = %s, j = %s. count = %s \n", i, j, count);
                }
                
            }
            if (count == 1) {
                //System.out.printf("record number = %s, \n", i);
                numbers_array.add(i);
            }
            
            
        }
        System.out.println(numbers_array);
        
    }
    
}
