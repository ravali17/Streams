import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<Integer>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.stream().map(x->x*x).forEach(x-> System.out.println(x));
        System.out.println("*****************");
        IntStream.range(1,10).filter(x->x%2==0).forEach(x-> System.out.println(x));
        System.out.println("*****************");
        IntStream.range(1,5).map(x->x*x).forEach(x-> System.out.println(x));

        System.out.println("*****************");
        IntStream.range(1,5).map(x->x+x).forEach(x-> System.out.println(x));
        System.out.println("*****************");
        IntStream.range(1,5).map(x->x-2).forEach(x-> System.out.println(x));
        System.out.println("*****************");
        IntStream.range(1,5).map(x->x/2).forEach(x-> System.out.println(x));
        System.out.println("*****************");
       mylist.stream().map(x -> x * x).filter(x -> x > 150).forEach(x -> System.out.println(x));
        System.out.println("*****************");
        int arr[] = new int[]{12,39,44,67};
        IntStream.range(0, arr.length).filter(index -> arr[index] % 2 == 0).forEach(x -> System.out.println(arr[x]));



    }
}
