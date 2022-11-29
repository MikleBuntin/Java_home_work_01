/**
 * program
 */
public class program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value -= 1;
            count++;
            System.out.println(value);
        }
        System.out.println(count);
    }
}