package Leetcode_Competitions;

public class MinimumLevels {
    public static void main(String[] args) {
        int res = minimumLevels(new int[] {0,1,0});
        System.out.println(res);
    }
    public static int minimumLevels(int[] a) {
        if(a.length <= 2){
            return -1;
        }
        int Bscore = 0, right = 0, Dscore = 0,steps = 1, MinSteps = Integer.MAX_VALUE;
        Boolean isPossible = false;
        for(int i = 1; i < a.length; i++){
            if(a[i] == 1){
                Bscore++;
            }else{
                Bscore--;
            }
        }
        while(right < a.length){
            if(a[right] ==1){
                Dscore+=1;
            }else {
                Dscore -= 1;
            }
            if(Dscore > Bscore){
                isPossible = true;
                if(steps < MinSteps){
                    MinSteps = steps;
                }
            }
            if(right + 1  < a.length && a[right+1] ==1){
                Bscore-=1;
            }else {
                Bscore += 1;
            }
            right++;
            steps++;
        }
        if(isPossible){
            return MinSteps;
        }return -1;
    }
}
