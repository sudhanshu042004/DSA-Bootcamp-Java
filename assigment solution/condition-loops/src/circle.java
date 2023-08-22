import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rad = input.nextInt();
        System.out.println(rad);
        float area = (float) ( 3.141 * rad * rad);
        System.out.println(area);
    }

}
