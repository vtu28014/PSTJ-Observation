import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int first = 0, second = 1, next = 0;

        if (n == 0) {
            System.out.println("Fibonacci Number = " + first);
        } else if (n == 1) {
            System.out.println("Fibonacci Number = " + second);
        } else {
            for (int i = 2; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Fibonacci Number = " + next);
        }

        sc.close();
    }
}