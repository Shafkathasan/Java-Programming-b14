import java.util.Scanner;

public class Q7BabyHeightFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];

        System.out.println("Enter the heights of 10 babies (in cm):");
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int height : heights) {
            if (height < min1) {
                min2 = min1;
                min1 = height;
            } else if (height < min2) {
                min2 = height;
            }
        }

        System.out.println("The two lowest heights are " + min1 + " cm and " + min2 + " cm.");
    }
}
