import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {1,2,3,4,56,7,8,9,15,23 };
        int target = in.nextInt();
        int ans = LinearSear(array, target);
        System.out.println(ans);
    }
    static int LinearSear (int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return arr[index];
            }
        }
        return -1;
    }
}
