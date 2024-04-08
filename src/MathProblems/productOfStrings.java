package MathProblems;

public class productOfStrings {
    public static void main(String[] args) {
        System.out.println(findProd("123456789","987654321"));
    }
    private static String findProd(String num1 , String num2){
        double sum = 0,k = 1;
        for(int i = num1.length()-1 ; i >= 0; i--){
            int curr = 0;
            int digit1 = num1.charAt(i) - '0';
            for (int j = 0; j < num2.length(); j++) {
                int digit2 = num2.charAt(j) - '0';
                int prod = digit1*digit2;
                if(curr == 0){
                    curr += prod;
                }else{
                    curr+= prod/10;
                    curr = curr*10 + prod%10;
                }
                if(j == num2.length() - 1){
                    sum += curr * k;
                    k = k * 10;
                }
            }
        }
        return sum + "";
    }
}
