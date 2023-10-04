public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7, 18,20,32};
        int target = 20;
        int num = Search(array,target);
        System.out.println(num);
    }

    static int Search(int[] array, int target){
        int start =0;
        int end = array.length-1;
        while (start<= end){
            int mid = start + (end - start)/2;
            if (array[mid] > target){
                end = mid-1;
            } else if (array[mid] < target){
                start = mid +1;
            } else return mid;
        }
        return -1;
    }
}
