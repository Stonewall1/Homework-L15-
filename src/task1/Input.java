package task1;

import java.time.LocalDate;

public class Input {

    private static void data(){
        LocalDate inputDate = LocalDate.of(2022 , 6 , 22);
        System.out.println(inputDate.getDayOfWeek());
    }

    public static void getData(){
        data();
    }
}
