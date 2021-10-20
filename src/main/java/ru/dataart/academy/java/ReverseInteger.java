package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {

        long reverseNum = 0;
        while (inputNumber != 0) {
            int popNumber = inputNumber % 10;
            inputNumber /= 10;

            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && popNumber > 7)) {
                return 0;
            }
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && popNumber < -8)) {
                return 0;
            }

            reverseNum = reverseNum * 10 + popNumber;
        }
        if (reverseNum >= 2147483648L || reverseNum <= -2147483648L) {
            throw new IncorrectNumberException("Некорректный число! Введите другое!");
        }
        return (int)reverseNum;
    }
}
