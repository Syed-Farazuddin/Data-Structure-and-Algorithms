package Strings.problems;

public class MergeStrings {
//    Leetcode 1768
    public static void main(String[] args) {
    String a = "abcd";
    String b = "pq";
    StringBuilder br = new StringBuilder();
    int ptr1 = 0,ptr2 = 0;
    while(ptr1 < a.length() && ptr2 < b.length()){
        if(br.length()%2 == 0){
            br.append(a.charAt(ptr1));
            ptr1++;
        }else{
            br.append(b.charAt(ptr2));
            ptr2++;
        }

    }
        while(ptr1 < a.length()){
            br.append(a.charAt(ptr1));
            ptr1++;
        }
        while(ptr2 < b.length()){
            br.append(b.charAt(ptr2));
            ptr2++;
        }
        System.out.println(br.toString());
    }
}
