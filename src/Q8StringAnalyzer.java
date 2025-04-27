public class Q8StringAnalyzer {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String[] words = input.split("\\s+");
        int charCount = input.replace(" ", "").length();
        int vowels = 0, consonants = 0;
        String str = input.replaceAll(" ", "").toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else consonants++;
        }
        System.out.println("Words: " + words.length + "\nChars: " + charCount +
                "\nVowels: " + vowels + "\nConsonants: " + consonants);
    }
}
