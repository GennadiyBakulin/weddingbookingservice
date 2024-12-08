package com.javaacademy.weddingbookingservice.service;

import com.javaacademy.weddingbookingservice.dto.BookingDto;
import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.mapper.BookingMapper;
import com.javaacademy.weddingbookingservice.repository.BookingRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

  private final BookingRepository bookingRepository;
  private final BookingMapper bookingMapper;

  public List<BookingDto> getBookingForNumber(int monthNumber) {
    return bookingRepository.getBookingForMonth(monthNumber).stream()
        .map(bookingMapper::convertToDto)
        .toList();
  }

  public void saveBooking(Booking booking) {
    bookingRepository.saveBooking(booking);
    booking.setBooked(true);
  }

  public int getCountBookingDayOfMonth(int monthNumber) {
    return bookingRepository.getCountBookingDayOfMonth(monthNumber);
  }
}
