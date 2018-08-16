import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;


public class NextDayCaculatorTest {
    @Test
    @DisplayName("Test day")
    public void testNextDayCaculator() {
        int[] time = {1, 1, 2018};
        int[] expected = {2, 1, 2018};

        int[] actual = NextDayCaculator.findNextDay(time);
        assertArrayEquals(expected, actual);
    }
}