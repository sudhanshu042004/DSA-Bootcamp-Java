public class ceilingNum {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,5,9,14,16,18};
        int target = 19;
       int ans= cieling(array,target);
        System.out.println(ans);
    }
    static int cieling(int[] array, int target){
        int start =0;
        int end = array.length-1;
        if (target>=array[array.length-1]){return -1;}
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target>array[mid]){
                start=mid+1;
            } else if (target<array[mid]) {
                end=mid-1;
            } else if (target == array[mid]) {
                return array[mid];
            }
        }
        return start;
    }
}
