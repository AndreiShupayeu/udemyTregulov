package home_work28;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HomeWork28 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2020, 12, 01, 9, 00, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 12, 01, 9, 00, 00);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);

        MyTime myTime = new MyTime();
        myTime.smena(ldt1, ldt2, p, d);

    }
}

class MyTime {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Работаем с: " + ldt1.format(f1) + " ");
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(f1));
            System.out.print("Отдыхаем с: " + ldt1.format(f2));
            ldt1 = ldt1.plus(d);
            System.out.println(" До" + ldt1.format(f2));
        }
    }

}


