public class SumOfPositiveDigits {

    public int sumOfPositiveDigits(int n) {
        // Base case: if n is a single-digit number, return n
        if (n < 10) {
            return n;
        }
        // Recursive case: sum of last digit + sum of remaining digits
        return (n % 10) + sumOfPositiveDigits(n / 10);
    }

    public static void main(String[] args) {
        SumOfPositiveDigits calculator = new SumOfPositiveDigits();
        int number = 101; // Example input
        int result = calculator.sumOfPositiveDigits(number);
        System.out.println("Sum of positive digits of " + number + " is: " + result);
    }
}
