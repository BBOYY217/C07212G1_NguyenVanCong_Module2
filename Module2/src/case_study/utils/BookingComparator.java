package case_study.utils;

import case_study.model.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate starDay1 = LocalDate.parse(o1.getStarDay(), formatter);
        LocalDate starDay2 = LocalDate.parse(o2.getStarDay(), formatter);
        LocalDate endDay1 = LocalDate.parse(o1.getEndDay(), formatter);
        LocalDate endDay2 = LocalDate.parse(o2.getEndDay(), formatter);

        if (starDay1.compareTo(starDay2) < 0) {
            return 1;
        } else if (starDay1.compareTo(starDay2) < 0) {
            return -1;
        } else {
            if (endDay1.compareTo(endDay2) > 0) {
                return 1;
            } else if (endDay1.compareTo(endDay2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
