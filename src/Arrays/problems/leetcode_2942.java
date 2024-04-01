package Arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class leetcode_2942 {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[] {"let","code"},'e'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for(String word : words){
           if(word.contains(String.valueOf(x))){
               list.add(i);
           }i++;
        }
        return list;
    }
}
