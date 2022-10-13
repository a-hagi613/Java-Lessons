import java.util.*;

public class ArrToArrList {
    public static void main(String[] args) {
        String[] FoodArr = {"pizza", "burger", "ice-cream", "pasta"};
        ArrayList<String> Cars = new ArrayList<String>();
        Cars.add("Honda");
        Cars.add("Ford");
        Cars.add("Toyota");
        Cars.add("Mazda");

        convertArrayToList(FoodArr);

        convertArrListToArr(Cars);
    }
    static void  convertArrayToList(String[] inputArr){
        List<String> OutputArrList = new ArrayList<String>();
        for(String input:inputArr) {
            OutputArrList.add(input);
        }
        System.out.println("Your original Array was: " + Arrays.toString(inputArr));
        System.out.println("Your new ArrayList is: " + OutputArrList);

    }

    static void  convertArrListToArr(ArrayList<String> inputArr){
        String[] OutputArr = new String[inputArr.size()];

        for(int i = 0; i < inputArr.size(); i++) {
            OutputArr[i] = inputArr.get(i);
        }
        System.out.println("Your original Array was: " + inputArr);

        System.out.println("Your new Array is: "+ Arrays.toString(OutputArr));

    }

}
