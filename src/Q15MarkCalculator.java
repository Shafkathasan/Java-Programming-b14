public class Q15MarkCalculator {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;
        int mark5 = 5;
        int mark10 = 10;

        // Let x = number of 5-mark questions, y = number of 10-mark questions
        // Equations:
        //   x + y = totalQuestions
        //   mark5*x + mark10*y = totalMarks
        // Solve for y:
        int y = (totalMarks - totalQuestions * mark5) / (mark10 - mark5);
        int x = totalQuestions - y;

        System.out.println("5 marks question is " + x);
        System.out.println("10 marks question is " + y);
    }
}
