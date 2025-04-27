import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Q12DiscountCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. "
                + "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        // Extract all numbers from the paragraph
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(paragraph);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        // numbers will contain: [7, 85000, 2500, 1]

        // Assign values based on position
        int laptopPrice = numbers.get(1);
        int mousePrice  = numbers.get(2);
        int mouseQty    = numbers.get(3);

        // Calculate total before discount
        int totalBeforeDiscount = laptopPrice + mousePrice * mouseQty;

        // Apply 15% discount
        double discountRate = 0.15;
        double totalAfterDiscount = totalBeforeDiscount * (1 - discountRate);

        // Output the result
        System.out.println("Total cost after 15% discount: "
                + (int) totalAfterDiscount + " tk");
    }
}
