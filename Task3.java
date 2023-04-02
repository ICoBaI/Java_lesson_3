import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add((int)(Math.random() * 10));
        }
        System.out.println("Данн массив: "+arr);
        System.out.println("average: "+average(arr));
        System.out.println("max: "+Collections.max(arr));
        System.out.println("min: "+Collections.min(arr));

    }

    static double average (ArrayList<Integer> list) {
        
        double sum = 0;
        
        for(int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }
        
        return sum/list.size();
    }
}
