package Leetcode_Competitions;

public class Bottles {
    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(13,6));
    }
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drankBottles = numBottles;
        while(numBottles >= numExchange){
                numBottles -= numExchange;
                numExchange++;
                numBottles++;
                drankBottles++;
        }
        return drankBottles;
    }
}
