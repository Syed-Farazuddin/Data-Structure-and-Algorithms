package Strings.problems;

public class FirstStringOccurance {
    public static void main(String[] args) {
        int x = Integer.MIN_VALUE;
        String y = "lskajf";

        System.out.println(strStr("adbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {
        int left = 0, right = needle.length()-1;
        StringBuilder br = new StringBuilder();
        for(int i = 0 ; i <= right; i++){
            br.append(haystack.charAt(i));
        }
//        br.deleteCharAt(left);
//        System.out.println(br.toString());
        while(right < haystack.length()){
//            adbutsad
            if(br.toString().equals(needle)){
                return left;
            }
            br.deleteCharAt(0);
            left++;
            right++;
            if(right < haystack.length()){
                br.append(haystack.charAt(right));
            }
        }
        return -1;
    }
}
