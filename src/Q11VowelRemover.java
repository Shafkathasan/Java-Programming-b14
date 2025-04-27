public class Q11VowelRemover {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String result = input.replaceAll("[AEIOUaeiou]", "").toLowerCase().replaceAll("\\s+", " ").trim();
        System.out.println(result);
    }
}
