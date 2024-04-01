package Arrays.problems;

public class leetcode_1672 {
    public static void main(String[] args) {
        int ans = maximumWealth(new int[][]{{1,23,4},{1,1,2}});
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE,weath = 0;
        System.out.println("Accounts length " + accounts.length);
        for(int i = 0 ; i < accounts.length ; i++){
            for(int money : accounts[i]){
                weath += money;
            }
            maxWealth = Math.max(weath,maxWealth);
            weath = 0;
        }
        return maxWealth;
    }
}
