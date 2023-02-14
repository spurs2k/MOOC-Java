import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        while (true) {
            if (total < num) {

                printText();
                total++;
            }
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");

    }
}
