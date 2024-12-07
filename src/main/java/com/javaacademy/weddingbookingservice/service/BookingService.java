package com.javaacademy.weddingbookingservice.service;

import com.javaacademy.weddingbookingservice.dto.BookingDto;
import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.mapper.BookingMapper;
import com.javaacademy.weddingbookingservice.repository.BookingRepository;
import java.time.Month;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

  private final BookingRepository bookingRepository;
  private final BookingMapper bookingMapper;

  public List<BookingDto> getBookingForNumber(Month monthNumber) {
    return bookingRepository.getBookingForMonth(monthNumber).stream()
        .map(bookingMapper::convertToDto)
        .toList();
  }

  public void saveBooking(Booking booking) {
    booking.setBooked(true);
    bookingRepository.saveBooking(booking);
  }

  public int getCountBookingDayOfMonth(Month monthNumber) {
    return bookingRepository.getCountBookingDayOfMonth(monthNumber);
  }
}
