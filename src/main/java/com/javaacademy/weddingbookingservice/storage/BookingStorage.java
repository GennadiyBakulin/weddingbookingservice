package com.javaacademy.weddingbookingservice.storage;

import com.javaacademy.weddingbookingservice.entity.Booking;
import java.time.Month;
import java.util.List;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.springframework.stereotype.Component;

@Component
public class BookingStorage {

  MultiValuedMap<Month, Booking> bookingMap = new ArrayListValuedHashMap<>();

  public void saveBooking(Booking booking) {
    bookingMap.put(booking.getMonthDay().getMonth(), booking);
  }

  public List<Booking> getBookingForMonth(Month month) {
    return bookingMap.get(month).stream().toList();
  }

  public int getCountBookingDayOfMonth(Month month) {
    return bookingMap.get(month).size();
  }
}
