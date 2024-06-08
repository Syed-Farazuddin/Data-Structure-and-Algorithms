import java.util.*;

public class GPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int cases = 0; cases < t; cases++) {
            int diffOrder = 0;
            int n = scanner.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for(int i = 0; i < n ; i++){
                list.add(scanner.nextLong());
            }
            long prev = 0;
            ArrayList<Long> list2 = new ArrayList<>();
            boolean removed = false, ans = false;
            for(int i = 1; i < n ; i++){
                long curr = findGCD(list.get(i) , list.get(i-1));
                list2.add(curr);
                if(curr < prev && !removed) {
                    list.remove(Math.min(list.get(i),list.get(i-1)));
                    i--;
                    removed = true;
                }else{
                    prev = curr;
                }
                if(removed && curr > prev){
                    System.out.println("No");
                    ans = true;
                }
//                prev = Math.max(prev,curr);
            }
            if(!ans){
                System.out.println("Yes");
            }
//            if(diffOrder > 1){
//                System.out.println("NO");
//            }else{
//                System.out.println("YES");
//            }
//            int count = 0;
//            for (int i = 0; i < list2.size(); i++) {
//                if(list.get(i-1) > list.get(i)){
//                    count++;
//                }
//            }
//            if(count > 2){
//
//            }
        }
        scanner.close();
    }
    private static long findGCD(long a , long b){
        if(a == 0) return b;
        if(b == 0) return a;
        return findGCD(Math.max(a,b)%Math.min(a,b) , Math.min(a,b));
    }
}
