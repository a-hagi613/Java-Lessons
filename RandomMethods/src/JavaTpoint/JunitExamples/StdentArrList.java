package JavaTpoint. JunitExamples;
import java.util.ArrayList;
import java.util.List;
public class StdentArrList {
    private List<String> students = new ArrayList<String>();


    public void add(String name) {
        students.add(name);
    }

    public void remove(String name) {
        students.remove(name);
    }

    public void removeAll(){
        students.clear();
    }

    public int sizeOfStudent() {
        return students.size();
    }

}  