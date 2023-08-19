import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inr: ");
        int inr = input.nextInt();
        int usd = (inr * 83);
        System.out.println("Usd: " + usd);
    }
}
