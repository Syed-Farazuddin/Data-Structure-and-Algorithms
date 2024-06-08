import java.util.Arrays;

public class LeetcodeDaily {
    public static void main(String[] args) {
        int [] x = {3,2,2,1};
        int limit = 3;
        System.out.println( numRescueBoats(x,limit));;
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1 = 0, p2 = people.length - 1;
        int ans = 0;
        while(p1 <= p2){
            if(p1 == p2){
                ans++;
                p1++;
                p2--;
                continue;
            }
            int sum = people[p1] + people[p2];
            if(sum > limit) {
                ans += 1;
                p2--;
            }else if(sum < limit){
                ans++;
                p1++;
                p2--;
            }else{
                ans++;
                p1++;
                p2--;
            }
        }
        return ans;
    }
}
