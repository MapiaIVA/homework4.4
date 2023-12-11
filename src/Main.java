public class Main {

    public static void main(String[] args) {
        for (int number = 10; number < 1000000; number++) {
            if (Armstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean Armstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}