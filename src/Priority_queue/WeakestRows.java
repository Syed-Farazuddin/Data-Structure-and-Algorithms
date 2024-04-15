package Priority_queue;

import java.util.*;

public class WeakestRows {
    public static class Pair{
        public int index,count;
        Pair(int idx, int val){
            this.index = idx;
            this.count = val;
        }
        public void display(){
            System.out.print("{" + this.count +" "  + this.index + "}" + " , ");
        }
        public int getCount(int val){
            if( this.count == val)
                return this.count;
            return -1;
        }
    }
    public static void main(String[] args) {
        int [][] mat = {{1,1,0,0,0},{1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat,k)));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> checks = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Pair> set = new ArrayList<>();
        for(int i = 0 ; i < mat.length ; i++){
            int Count = 0;
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1){
                    Count++;
                }
            }
            Pair p = new Pair(Count,i);
            set.add(p);
            pq.add(Count);
        }
        int [] res = new int[k];
        int i = 0;

        for(Pair x : set){
            System.out.print("{" + x.count +" "  + x.index + "}" + " , ");
        }
        System.out.println();


        for(int j = 0 ; j < k ; j++){
            int curr = -1 , check = -1;
            while(check == -1){
                if(!pq.isEmpty()) {
                    curr = pq.peek();
                    System.out.println(curr + " --> This is Curr key");
                    for(Pair x : set){
                        if(check == -1){
                            check = x.getCount(curr);
                            if(checks.contains(check)) {
                                check = -1;
                            }
                        }else {
                            System.out.println(x.count + " " + x.index);
                            checks.add(x.count);
                            break;
                        }
                    }
                }else break;
            }
            pq.poll();
            System.out.println(check);
            res[i] = check;
            i++;
        }
        return res;
    }
}
