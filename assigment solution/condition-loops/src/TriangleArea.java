import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();
        float area = (base * height)/2;
        System.out.println(area);
    }
}
