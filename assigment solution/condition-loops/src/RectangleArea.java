import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("give value of Length and breadth for rectangle" );
        float l = in.nextFloat();
        float b = in.nextFloat();
        float area = l * b;
        System.out.println(area);
    }
}
