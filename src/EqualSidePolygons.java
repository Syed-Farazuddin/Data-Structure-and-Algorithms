import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EqualSidePolygons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
//        for (int i = 0; i < cases; i++) {
//            HashMap<Integer , Integer> map = new HashMap<>();
//            HashSet<Integer> set = new HashSet<>();
//            int n = sc.nextInt();
//            for (int j = 0; j < n; j++) {
//                int curr = sc.nextInt();
//                set.add(curr);
//                map.put(curr, map.getOrDefault(curr, 0) + 1);
//            }
//            int count = 0;
//            for(int num : set){
//
//                   count +=  map.get(num)/3;
//               }
//
//            System.out.println(count);
        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int j = 0 ; j < n ; j++){
                arr[j] = sc.nextInt();
            }
            BruteForce(arr,n);
        }
    }
    private static void BruteForce(int [] arr,int size){
       int res = 0;
        for(int i = 0 ; i < size ; i++){
            int count = 0;
            for(int j = 0 ; j < size  ; j++){
                if(j != i ){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            res += count/3;
        }
        System.out.println(res);
    }
}
