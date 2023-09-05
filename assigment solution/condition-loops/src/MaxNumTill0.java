import java.util.Scanner;

public class MaxNumTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true){
            int x = in.nextInt();
            if (x > max) max = x;
            if (x == 0)break;
        }
        System.out.println(max);
    }
}
