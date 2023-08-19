import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("give two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        System.out.println("add : " + add + ", " +
        "sub : " + sub + ", " + "mult : " + ", " + mult + ", " + "div : " + div

        );
    }
}
