import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int length = (int) (Math.log10(num) + 1);
        int n = num;
        armstrong(num, length, n);
    }
    static void armstrong(int num, int length, int n){
        int sum = 0;
       while(num > 0){ int digit = num % 10;
        sum += (int) Math.pow(digit,length);
           num /= 10;
       }


        if (sum == n){
            System.out.println(n + " this is armstrong");
        }else {
            System.out.println(n + " this is not armstrong");
        }
    }
}
