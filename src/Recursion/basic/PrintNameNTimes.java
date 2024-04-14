package Recursion.basic;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(5);
    }
    public static void printName(int n){
        if(n <= 0){
            return;
        }
        System.out.print("FARAZ" + "  ");
        printName(n-1);
    }
}
