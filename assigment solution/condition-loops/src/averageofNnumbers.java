import java.util.Scanner;

public class averageofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        float average = (float) total / n;
        System.out.println(average);
    }
}
