package Arrays.problems;

public class Findpairs {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int key = 60;
        int ptr = 0, ptr2 = arr.length-1;
        while(ptr < ptr2){
            if(arr[ptr] + arr[ptr2] == key){
                System.out.println("(" + arr[ptr] + "+" + arr[ptr2] + "=" + key + ")");
                ptr++;
                ptr2--;
                continue;
            }
            if(arr[ptr] + arr[ptr2] > key){
                ptr2--;
            }else{
                ptr++;
            }
        }
    }
}
