import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int c = 2; c < x * x; c++){
            int factor = 0;
            if (x % c == 0){
                factor += c;
                System.out.println(factor);
            }

        }
    }
}
