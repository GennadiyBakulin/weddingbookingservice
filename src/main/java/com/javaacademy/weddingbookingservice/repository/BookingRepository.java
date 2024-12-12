package com.javaacademy.weddingbookingservice.repository;

import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.storage.BookingStorage;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookingRepository {

  private final BookingStorage bookingStorage;

  public void save(Booking booking) {
    bookingStorage
        .getData()
        .computeIfAbsent(booking.getMonth(), k -> new ArrayList<>())
        .add(booking);
  }

  public List<Booking> getByMonthNumber(int month) {
    return bookingStorage.getData().getOrDefault(month, new ArrayList<>());
  }
}
