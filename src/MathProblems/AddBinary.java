package MathProblems;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1011";
//        int sum1 = ConvertIntoInt(a);
//        NumberToBinary(21);
        System.out.println(1/10);
    }
    public static String NumberToBinary(int n){
        StringBuilder br = new StringBuilder();
        while (n > 0){
           br.insert(0,n&1);
            n = n >>1;
        }
        System.out.println(br.toString());
        return br.toString();
    }
    public static int ConvertIntoInt(String a){
        int pow = 0, sum = 0;
        for(int i = a.length()-1; i >= 0; i--){
            if(a.charAt(i) == '1'){
                sum +=(int)Math.pow(2,pow);
            }
            pow++;
        }return sum;
    }
}
