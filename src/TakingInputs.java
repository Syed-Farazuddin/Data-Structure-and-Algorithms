import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iterator<Integer> it = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return 0;
            }
        };
        ArrayList<Integer> list = new ArrayList<>();
        if(it.hasNext()){
            list.add(it.next());
        }
        System.out.println(list);
    }
}
