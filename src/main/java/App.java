import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3},
                            {4, 5, 6},
                            {7, null, 9}};

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(null);
        row3.add(9);

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(row1);
        list.add(row2);
        list.add(row3);

        System.out.println(flatten(list));
    }

    private static<T> List<T> flatten(ArrayList<ArrayList<T>> input){
        ArrayList<T>result =  new ArrayList<T>();

//        Arrays.asList(input).stream()
//                .flatMap(t -> t)
//                .collect(Collectors.toList());

        for (List<T> t : input) {
            result.addAll(t);
        }

        for (T t : result) {
            if (t == null) {
                result.remove(t);
            }
        }

        return result;
    }
}


