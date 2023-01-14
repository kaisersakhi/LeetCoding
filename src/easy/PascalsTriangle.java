package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static  List<List<Integer>> generate(int numRows){
        List<List<Integer>> mainList = new ArrayList<>();
        if (numRows <= 0) return mainList;
        ArrayList<Integer> initial = new ArrayList<>();
        initial.add(1);
        mainList.add(initial);
        for (int i = 1; i < numRows ; ++i ){
            List<Integer> previousList = mainList.get(i -1);
            List<Integer> row = new ArrayList<>(i + 1);
            int k = 1;
            row.add(1);
            for (int j = 0; j < previousList.size() -1; ++j){
                row.add(previousList.get(j) + previousList.get(k++));
            }
            row.add(1);
            mainList.add(row);
        }
        return mainList;
    }
}
