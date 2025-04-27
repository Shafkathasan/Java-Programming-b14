import java.util.Scanner;

public class Q9BinaryValidator {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        boolean isBinary = input.matches("[01]+");
        System.out.println(isBinary);
    }
}
