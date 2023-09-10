public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{
                {7,1,3},
                {2,8,7},
                {1,9,5},
        };
        maximumWealth(accounts);
    }
    static int maximumWealth(int[][] accounts){
        int maxWealth= Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int count = 0;
            for (int col = 0; col <accounts[row].length ; col++) {
                int digit = accounts[row][col];
                count +=digit;
            }
           if (maxWealth<count){
               maxWealth=count;
           }
        }
        System.out.println(maxWealth);


        return maxWealth;
    }
}
