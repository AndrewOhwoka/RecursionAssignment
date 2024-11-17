public class DecimalToBinaryRecursive {

    public String decimalToBinary(int n) {
        // Base cases
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        // Recursive case
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        DecimalToBinaryRecursive converter = new DecimalToBinaryRecursive();
        int decimalNumber = 10; // Example input
        String binaryRepresentation = converter.decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryRepresentation);
    }
}
