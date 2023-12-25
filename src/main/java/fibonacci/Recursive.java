package fibonacci;

public class Recursive {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        int result = fibonacci(n);
        System.out.println("Число Фібоначчі для n=" + n + ": " + result);
    }
}
