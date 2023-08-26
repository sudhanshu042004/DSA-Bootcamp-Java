import java.util.Scanner;

public class volCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi = (float) 3.14159F;
        float r = in.nextFloat();
        float h = in.nextFloat();
        double vol = pi * (Math.pow(r,2)) * (h/3);
        System.out.println(vol + " cubic Centimeter");
    }
}
