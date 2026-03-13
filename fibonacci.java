public class fibonacci {
    public static int f1ibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return f1ibonacci(n - 1) + f1ibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + f1ibonacci(n));
    }
}