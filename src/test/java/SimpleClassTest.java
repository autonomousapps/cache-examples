import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleClassTest {

    @Test
    public void testMultiply() {
        assertEquals(4, new SimpleClass().multiply(2, 2));
    }
}
