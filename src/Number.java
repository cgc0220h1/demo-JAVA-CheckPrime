import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        boolean isSpecialNum = false;
        boolean isPrime = true;

        if (number <= 1) {
            isSpecialNum = true;
            isPrime = false;
        }

        if (!isSpecialNum) {
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.printf("%d is a Prime number", number);
        } else {
            System.out.printf("%d is NOT a Prime number", number);
        }
    }
}
