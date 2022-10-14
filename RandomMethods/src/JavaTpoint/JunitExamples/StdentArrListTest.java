package JavaTpoint.JunitExamples;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class StdentArrListTest {
    StdentArrList obj = new StdentArrList();


    @Test
    public void testAdd() {
        obj.add("Abdullahi");
        obj.add("Agrey");
        obj.add("Chinedu");
        obj.add("Dedan");
        obj.add("Jibril");
        obj.add("Mohammed");
        assertEquals("Adding 6 student to list", 6, obj.sizeOfStudent());
    }

    @Test
    public void testSize() {
        obj.add("Dedan");
        obj.add("Jibril");
        obj.add("Mohammed");
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());
    }

    @Test
    public void testRemove() {
        obj.add("Agrey");
        obj.add("Chinedu");
        obj.remove("Chinedu");
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());
    }

    @Test
    public void removeAll() {
        obj.removeAll();
    }
}


