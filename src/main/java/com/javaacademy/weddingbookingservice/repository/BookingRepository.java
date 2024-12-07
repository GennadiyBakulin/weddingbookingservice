package com.javaacademy.weddingbookingservice.repository;

import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.storage.BookingStorage;
import java.time.Month;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookingRepository {

  private final BookingStorage bookingStorage;

  public List<Booking> getBookingForMonth(Month month) {
    return bookingStorage.getBookingForMonth(month);
  }

  public void saveBooking(Booking booking) {
    bookingStorage.saveBooking(booking);
  }

  public int getCountBookingDayOfMonth(Month month) {
    return bookingStorage.getCountBookingDayOfMonth(month);
  }

}
