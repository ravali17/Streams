

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(30);

        List<Integer> myList = new ArrayList<>();
        list.stream().map(x -> x * x).filter(x -> {
                    if (!myList.contains(x)) {
                        myList.add(x);
                        return true;
                    }
                    return false;
                }
        ).collect(Collectors.toList());

        for (int x : myList) {
            System.out.println(x);
        }
    }
}