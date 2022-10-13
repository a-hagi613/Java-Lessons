import java.util.*;

public class IteratorMethod {
    public static void main(String[] args) {
        ArrayList<Integer> Nums = new ArrayList<Integer>();
        Nums.add(1);
        Nums.add(2);
        Nums.add(3);
        Nums.add(4);
        Nums.add(5);
        Nums.add(6);
        Nums.add(7);
        Nums.add(8);
        Nums.add(9);
        Nums.add(10);

        // Get the iterator
        Iterator<Integer> it = Nums.iterator();

        // Loop through a collection
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
