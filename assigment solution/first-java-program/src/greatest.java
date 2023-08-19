import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give us two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b){
            System.out.println(a + " is greatest.");
        } else {
            System.out.println(b + " is greatest.");
        }
    }
}
