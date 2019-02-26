import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleLibClassTest {

    @Test
    public void testAdd() {
        assertEquals(5, new SimpleLibClass().add(2, 3));
    }
}
