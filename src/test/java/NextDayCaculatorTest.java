import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;


public class NextDayCaculatorTest {
    @Test
    @DisplayName("Test the first day of January, 2018")
    public void testFirstDayOfJanuary() {
        int[] time = {1, 1, 2018};
        int[] expected = {2, 1, 2018};

        int[] actual = NextDayCaculator.findNextDay(time);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Test the last day of January, 2018")
    public void testLastDayOfJanuary() {
        int[] time = {31, 1, 2018};
        int[] expected = {1, 2, 2018};

        int[] actual = NextDayCaculator.findNextDay(time);
        assertArrayEquals(expected, actual);
    }
}