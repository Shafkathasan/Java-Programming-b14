public class Q14IPAddressValidator {
    public static void main(String[] args) {
        String[] testIps = {
                "192.168.0.1",
                "172.16.56",
                "0.0.0.1",
                "1.12.72.2"
        };

        for (String ip : testIps) {
            System.out.printf("%-15s : %s%n", ip, isValidIP(ip) ? "Valid IP" : "Invalid IP");
        }
    }

    private static boolean isValidIP(String ip) {
        // Split into 4 parts by dot
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        // First segment must not be a single digit and must not start with '0'
        String first = parts[0];
        if (first.length() == 1 || first.startsWith("0")) {
            return false;
        }

        // Check each segment is a number 0–255, with no leading zeros in multi-digit segments
        for (String part : parts) {
            if (part.isEmpty()) return false;
            try {
                int value = Integer.parseInt(part);
                if (value < 0 || value > 255) return false;
                if (part.length() > 1 && part.startsWith("0")) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
