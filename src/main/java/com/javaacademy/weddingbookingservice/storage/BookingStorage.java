package com.javaacademy.weddingbookingservice.storage;

import com.javaacademy.weddingbookingservice.entity.Booking;
import java.util.List;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.springframework.stereotype.Component;

@Component
public class BookingStorage {

  MultiValuedMap<Integer, Booking> bookingMap = new ArrayListValuedHashMap<>();

  public void saveBooking(Booking booking) {
    bookingMap.put(booking.getMonth(), booking);
  }

  public List<Booking> getBookingForMonth(int month) {
    return bookingMap.get(month).stream().toList();
  }

  public int getCountBookingDayOfMonth(int month) {
    return bookingMap.get(month).size();
  }
}
