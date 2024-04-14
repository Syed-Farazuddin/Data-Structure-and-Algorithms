package BitManupulation;

public class AddTwo {
    public static void main(String[] args) {
        System.out.println(getSum(4,3));
    }
    public static int getSum(int a, int b) {
        int res =0,idx = 0;
        while(a > 0 || b > 0){

            int carry =0 , sum = 0, x = res;
            if((a&1) == 1 && (b&1) == 1){
                carry = 1;
                sum = 0;
            }else{
                sum = 1;
                carry = 0;
            }
            a = a >> 1;
            b = b >> 1;
            res = x << idx | sum;
            if(carry == 1){
                res = x << idx+1 | carry;
            }
            idx++;
        }
        return res;
    }

}
