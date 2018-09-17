package Fibonacci;

public class Calculate {
    public long getResult(int index) {
        if (index < -1 || index > 50) {
            throw new IllegalArgumentException();
        }
        if (index == 0 || index == 1 || index == 2) {
            return 1;
        }
        return getResult(index - 1) + getResult(index - 2);
    }


}
