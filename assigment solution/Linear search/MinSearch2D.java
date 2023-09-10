import java.util.Arrays;

public class MinSearch2D {
    public static void main(String[] args) {
        int[][] array =  {
                {1,3,4},
                {2,9,6},
                {7,8,0}
        };
        int target = 8;
        System.out.println(Arrays.toString(search(array)));
    }
    static int[] search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max = arr[row][col];

                }

            }

        }
        return new int[]{max};

    }
}
