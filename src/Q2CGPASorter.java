public class Q2CGPASorter {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int n = cgpa.length;

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

        System.out.println("Sorted CGPAs (Descending):");
        for (double score : cgpa) {
            System.out.print(score+", ");
        }
    }
}
