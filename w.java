import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SOQuestion {

   
    public static void printSolution(List list, HashSet indexes) {
        Iterator iter = indexes.iterator();
        while (iter.hasNext()) {
            System.out.print(list.get((Integer) iter.next()) + " ");
        }
        System.out.println();
    }

   
    public static float avg(List list, HashSet indexes) {
        Iterator iter = indexes.iterator();
        float sum = 0;
        while (iter.hasNext()) {
            sum += (Integer) list.get((Integer) iter.next());
        }
        return sum / indexes.size();
    }

    
    public static float avg_e(List list, HashSet indexes) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!indexes.contains(i)) {
                sum += (Integer) list.get(i);
            }
        }
        return sum / (list.size() - indexes.size());
    }

    public static void backtrack(List list, int start, HashSet indexes) {
        for (int i = start; i < list.size(); i++) {
            indexes.add(i);
            if (avg(list, indexes) == avg_e(list, indexes)) {
                System.out.println("Solution found!");
                printSolution(list, indexes);
            }
            backtrack(list, i + 1, indexes);
            indexes.remove(i);
        }
    }

    public static void main(String[] args) {
        List test = new ArrayList();
        test.add(2);
        test.add(1);
        test.add(3);

        backtrack(test, 0, new HashSet());
    }
}
