
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int countNum = 0;
        int evens = 0;
        int odds = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            sum += num;
            countNum++;
            
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNum);

        double average = (double) sum / countNum;
        System.out.println("Average: " + average);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
