
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number. Enter 4 to quit");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 4) {
                break;
            }

        }
    }
}
