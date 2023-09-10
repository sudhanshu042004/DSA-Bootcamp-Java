public class minimum {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,6,9,8,0};
        System.out.println(min(array));
    }
    static int min(int[] arr){
        int mini = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (mini> arr[i]){
                mini = arr[i];
            }

        }
        return mini;
    }
}
