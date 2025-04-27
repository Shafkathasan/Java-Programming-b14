import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q13TransactionIdExtractor {
    public static void main(String[] args) {
        String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Transactions</title>
            </head>
            <body>
                <div>
                    <div class="button">
                        <p>Transaction Id: TXN1234</p>
                    </div>
                </div>
            </body>
            </html>
            """;

        // Pattern to match "Transaction Id: " followed by the ID
        Pattern pattern = Pattern.compile("Transaction Id:\\s*(TXN\\d+)");
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            String txnId = matcher.group(1);
            System.out.println("Transaction Id: " + txnId);
        } else {
            System.out.println("No Transaction Id found.");
        }
    }
}
