import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int x = 0; x < n-2; x++){
            int fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }
    }
}
