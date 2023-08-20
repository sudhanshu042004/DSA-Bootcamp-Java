import java.util.Scanner;

public class plindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int n = word.length();
        boolean Palindrome;
        Palindrome = true;
        for (int i=0; i < n; i++){
            if (word.charAt(0) != word.charAt(n -1 -i)){

                Palindrome = false;
            }
            break;
        }

        if (Palindrome == true){
            System.out.println("word is Palindrome");
        } else {
            System.out.println("word is not Palindrome");
        }
    }

}
