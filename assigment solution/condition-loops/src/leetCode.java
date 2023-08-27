public class leetCode {
    public static void main(String[] args) {
        int n = 234;
        String string = String.valueOf(n);
        int sum = 0;
        int mul = 1;
        int length = string.length();
        for (int x = 1; x<=length; x++){
            int last = n % 10;
            n = n /10;
            sum += last;
            mul *= last;
        }
        int diff = mul - sum;
        System.out.println(diff);

    }
}
