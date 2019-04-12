package task5.tests;

import org.junit.Test;
import task5.HandMadeList;

import static org.junit.Assert.*;

public class DollTest {

    @Test
    public void putOn() {
        var list = new HandMadeList<String>();
        list.add("AAA");
        var sB = new StringBuilder();
        sB.append("AAA");
        var exStr = sB.toString();
        list.remove(sB);
        assertEquals(0, list.size());
    }

    @Test
    public void putOff() {
    }
}