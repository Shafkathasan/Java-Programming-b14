public class Q1SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max = Double.MIN_VALUE;
        double secondMax = Double.MIN_VALUE;
        for (double score : cgpa) {
            if (score > max) {
                secondMax = max;
                max = score;
            } else if (score > secondMax && score != max) {
                secondMax = score;
            }
        }
        System.out.println("Second highest CGPA: " + secondMax);
    }
}
