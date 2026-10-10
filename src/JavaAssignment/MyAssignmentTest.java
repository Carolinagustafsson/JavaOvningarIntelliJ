package JavaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAssignmentTest {

    @Test
    public void testCountRows() {
        String input = "Wrong Input";
        TextCounter counter = new TextCounter();

        counter.countRows(input);

        int expected = 1;
        int actual = counter.getRows();

        assertEquals(expected, actual);
    }

    @Test
    public void testCountLetters() {
        String input = "Wrong Input";
        TextCounter counter = new TextCounter();

        counter.countLetters(input);

        int expected = 11;
        int actual = counter.getLetters();

        assertEquals(expected, actual);
    }


    @Test
    public void testStopWord() {
        assertTrue(MyAssignment.isStop("stopp"));
        assertFalse(MyAssignment.isStop("Hej"));
    }

}

