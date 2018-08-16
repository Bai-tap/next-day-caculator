public class NextDayCaculator {
    public static int[] findNextDay(int[] time) {
        time[0] = time[0] + 1;
        time[1] = 1;
        time[2] = 2018;
        return time;
    }
}