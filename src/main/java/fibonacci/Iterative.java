package fibonacci;

public class Iterative {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 15;
        int result = fibonacci(n);
        System.out.println("Число Фібоначчі для n=" + n + ": " + result);
    }
}
