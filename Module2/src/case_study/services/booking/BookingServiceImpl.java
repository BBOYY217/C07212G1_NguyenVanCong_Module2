package case_study.services.booking;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.model.Facility;
import case_study.model.Villa;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "cong", "21/7/2001", "nam", "123456789", "cong@gmail", "V.I.P", "DN"));
        customerList.add(new Customer(2, "cuong", "30/8/2001", "nam", "123456789", "cuong@gmail", "V.I.P", "DN"));

        facilityIntegerMap.put(new Villa(1, "Villa 1", 200, 200, 10, "1 day", "VIP", 50.0, 15), 0);
    }
    @Override
    public void addBooking(){

    }

    @Override
    public void displayListBooking() {

    }


}
