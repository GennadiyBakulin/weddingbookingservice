package com.javaacademy.weddingbookingservice.controller;

import com.javaacademy.weddingbookingservice.dto.BookingDto;
import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.service.BookingService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

  private final BookingService bookingService;

  @PostMapping
  public void saveBooking(@RequestBody Booking booking) {
    bookingService.saveBooking(booking);
  }

  @GetMapping("/month/{monthNumber}")
  public List<BookingDto> getBookingForNumber(@PathVariable int monthNumber) {
    return bookingService.getBookingForNumber(monthNumber);
  }

  @GetMapping("/month/{monthNumber}/free")
  public Map<String, Integer> getCountBookingDayOfMonth(@PathVariable int monthNumber) {
    Map<String, Integer> map = new HashMap<>();
    map.put("count", bookingService.getCountBookingDayOfMonth(monthNumber));
    return map;
  }
}
