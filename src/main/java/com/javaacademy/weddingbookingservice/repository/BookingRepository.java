package com.javaacademy.weddingbookingservice.repository;

import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.storage.BookingStorage;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookingRepository {

  private final BookingStorage bookingStorage;

  public void save(Booking booking) {
    bookingStorage.getData().put(booking.getMonth(), booking);
  }

  public List<Booking> getByMonthNumber(int month) {
    return bookingStorage.getData().get(month).stream().toList();
  }

  public int getCountDayOfMonth(int month) {
    return bookingStorage.getData().get(month).size();
  }
}
