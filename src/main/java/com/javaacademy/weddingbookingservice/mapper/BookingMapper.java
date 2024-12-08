package com.javaacademy.weddingbookingservice.mapper;

import com.javaacademy.weddingbookingservice.dto.BookingDto;
import com.javaacademy.weddingbookingservice.entity.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {

  public BookingDto convertToDto(Booking booking) {
    return new BookingDto(booking.getMonth(),
        booking.getDay(), booking.isBooked());
  }

}
