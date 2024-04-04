package Arrays.problems;

import java.util.ArrayList;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println("Missing Numbers: "+findMissing(new int []{10,11,12,13,15,18,20}));
        String str  = "djadgl";
        System.out.println(str.contains(""+'b'));;
    }
    public static ArrayList<Integer> findMissing(int [] a){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length-1 ; i++){
            if(a[i] != a[i+1] + 1){
                for(int j = a[i]+1; j < a[i+1]; j++){
                    list.add(j);
                }
            }
        }
        return list;
    }
}
