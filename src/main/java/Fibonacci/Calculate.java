package Fibonacci;

public class Calculate {
    public long getResult(int index) {
        if (index < 1 || index > 50) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        long firstNumber = 1;
        long secondNumber = 1;
        for (int i = 3; i <= index; i++) {
            long temp = firstNumber;
            firstNumber = firstNumber + secondNumber;
            secondNumber = temp;
        }
        return firstNumber;
    }


}
