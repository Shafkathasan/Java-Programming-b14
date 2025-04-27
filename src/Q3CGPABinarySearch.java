import java.util.Scanner;

public class Q3CGPABinarySearch {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int n = cgpa.length;

        // Sort the array
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (cgpa[j] > cgpa[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = cgpa[i];
            cgpa[i] = cgpa[maxIndex];
            cgpa[maxIndex] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CGPA to search: ");
        double target = scanner.nextDouble();

        boolean found = binarySearch(cgpa, target);
        System.out.println("CGPA " + target + " is " + (found ? "present" : "not present"));
    }

    private static boolean binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
