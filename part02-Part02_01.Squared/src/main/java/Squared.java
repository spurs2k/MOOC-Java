
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int first = Integer.valueOf(scanner.nextLine());
        int square = first * first;
        System.out.println(square);
    }
}