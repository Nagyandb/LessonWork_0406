package main.tasks;

public class DigitAdder {

    public static void main(String[] args) {
        int number = -5483229;

        System.out.println(addDigits(5483229));
    }

    /**
     * Összeadja egy szám számjegyeit, és visszatér az összeggel.
     */
    public static int addDigits(int number) {
        int numPos = Math.abs(number);
        int result = 0;

        while (numPos > 0) {
            int digit = numPos % 10;
            result += digit;
            numPos /= 10;
        }
        return result;
    }

}
