package com.javaacademy.weddingbookingservice.mapper;

import com.javaacademy.weddingbookingservice.dto.BookingDtoRp;
import com.javaacademy.weddingbookingservice.dto.BookingDtoRq;
import com.javaacademy.weddingbookingservice.entity.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {

  public BookingDtoRp convertToDto(Booking booking) {
    return new BookingDtoRp(booking.getMonth(),
        booking.getDay(), booking.isBooked());
  }

  public Booking convertToEntity(BookingDtoRq bookingDtoRq) {
    Booking booking = new Booking(bookingDtoRq.getMonth(), bookingDtoRq.getDay());
    booking.setBooked(true);
    return booking;
  }
}
