public class NextDayCaculator {
    public static void main(String[] args) {
    }

    public static int[] findNextDay(int[] time) {
        if (time[1] == 2) {
            if (getLeapYear(time) == false) {
                if (time[0] == 28) {
                    time[0] = 1;
                    time[1] = 3;
                }
            } else {
                if (time[0] == 29) {
                    time[0] = 1;
                    time[1] = 3;
                }
            }
        } else if (time[1] == 1 || time[1] == 3 || time[1] == 5 || time[1] == 7 || time[1] == 8 || time[1] == 10) {
            if (time[0] == 31) {
                time[0] = 1;
                time[1] = time[1] + 1;
            } else {
                time[0] = time[0] + 1;
            }
        } else if (time[1] == 12) {
            if (time[0] == 31) {
                time[0] = 1;
                time[1] = 1;
                time[2] = time[2] + 1;
            } else time[0] = time[0] + 1;
        } else {
            if (time[0] == 30) {
                time[0] = 1;
                time[1] = time[1] + 1;
            }
        }
        return time;
    }

    public static boolean getLeapYear(int[] time) {
        boolean leapYear;
        if (time[2] % 4 == 0) {
            if (time[2] % 100 == 0) {
                if (time[2] % 400 == 0) {
                    return leapYear = true;
                } else {
                    return leapYear = false;
                }
            } else {
                return leapYear = true;
            }
        } else return leapYear = false;
    }
}