package task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TuesdayGone {

    private static void nextTuesday(){
        LocalDate date = LocalDate.of(2022 , 6 ,22);
        int x = date.getDayOfMonth();
        while(true) {
            if (date.getDayOfWeek() == DayOfWeek.TUESDAY && date.getDayOfMonth() != x) {
                System.out.println("Next tuesday : " + date);
                break;
            }
            date = date.plusDays(1);
        }
    }

    public static void getNextTuesday(){
        nextTuesday();
    }
}
