import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int c = a; c <= b; c++){
            String stringC = String.valueOf(c);
             int length = stringC.length();
             int sum = 0;

             for(int i= 0; i < length; i++ ){
                 char character = stringC.charAt(i);
                 int num = Integer.parseInt(String.valueOf(character));
                 sum += Math.pow(num, length);
             }
             if (sum == c){
                 System.out.println("Armstrong no.s :" + c);
             }
        }




    }
}
