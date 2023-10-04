public class FloorSearch {
    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,9,14,16,18};
       int target = 9;
       int ans = Floor(array,target);
        System.out.println(ans);
    }
    static int Floor(int[] array,int target){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target > array[mid]){
                start=mid+1;
            } else if (target<array[mid]) {
                end=mid-1;
            } else if (target==array[mid]) {
                return array[mid];
            }
        }
        return end;
    }
}
