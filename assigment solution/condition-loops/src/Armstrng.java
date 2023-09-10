import java.util.Scanner;

public class Armstrng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original = num;
        int sum = 0;
        int length = (int) (Math.log10(num) + 1);
        while(num != 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, length);
            num = num / 10;
        }
        if (sum == original){
        System.out.println("true, this is Armstrong num");
        }
        if (sum != original){
            System.out.println("false, this is Armstrong num");
        }

    }
}
