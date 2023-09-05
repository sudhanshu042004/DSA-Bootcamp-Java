import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int factorial = 1;
        for (int n = a; n!=0; n--){
            factorial *= n;
        }
        System.out.println(factorial);
    }


}
