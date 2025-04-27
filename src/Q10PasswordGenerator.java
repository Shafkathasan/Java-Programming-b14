import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q10PasswordGenerator {
    public static void main(String[] args) {
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()_+";
        List<Character> password = new ArrayList<>();
        Random rand = new Random();

        password.add(capital.charAt(rand.nextInt(capital.length())));
        password.add(small.charAt(rand.nextInt(small.length())));
        password.add(digits.charAt(rand.nextInt(digits.length())));
        password.add(special.charAt(rand.nextInt(special.length())));

        String all = capital + small + digits + special;
        for (int i = 0; i < 4; i++) {
            password.add(all.charAt(rand.nextInt(all.length())));
        }

        Collections.shuffle(password);
        StringBuilder sb = new StringBuilder();
        for (char c : password) sb.append(c);
        System.out.println("Generated Password: "+sb);
    }
}
