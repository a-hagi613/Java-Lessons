import java.util.*;

public class ToDoList
{
    public static void main(String[] args){
        // Rewrite this code to use an ArrayList instead of an array
        ArrayList<String> toDoList = new ArrayList<String>();
        toDoList.add(0, "Do homework");
        toDoList.add(1, "Help make dinner");
        toDoList.add(2, "Call grandma");
        System.out.println(toDoList);

        // changing element at index 1
        toDoList.set(1, "Order pizza");
//
        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: "
                + toDoList.get(0));

        // remove item 0 and move everything down
        //  (this can be done in 1 command with ArrayList)
        toDoList.remove(0);
        System.out.println("Here's the next thing to do: "
                + toDoList.get(0));
        System.out.println(toDoList);


        // Why is an ArrayList better than an array for a toDoList?
        // Answer:
    }
}
