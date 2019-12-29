package org.pierre.collections;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MyTemporalAdjuster {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().withMonth(11).withDayOfMonth(1).with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now().withMonth(11).with(TemporalAdjusters.firstDayOfNextMonth())));
    }
}
