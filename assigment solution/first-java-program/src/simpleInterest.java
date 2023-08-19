import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("whats your principle?" );
        int p = input.nextInt();
        System.out.println("Time?");
        int t = input.nextInt();
        System.out.println("rate?");
        float r = input.nextFloat();
        float Interest = (p * t * r)/100;
        System.out.println("Here is your Simple interest, I calculates: " + Interest);

    }
}
