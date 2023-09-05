import java.util.Scanner;

public class Enter0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        while(true){
            int x = in.nextInt();
            sum += x;
            if (x == 0)break;
        }
        System.out.println("Total sum: " + sum);

    }
}
