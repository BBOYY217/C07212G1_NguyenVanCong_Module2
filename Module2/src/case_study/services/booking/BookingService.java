package case_study.services.booking;

import case_study.model.Booking;
import case_study.services.Service;

public interface BookingService extends Service<Booking>{
    void addBooking();
    void displayListBooking();
}
