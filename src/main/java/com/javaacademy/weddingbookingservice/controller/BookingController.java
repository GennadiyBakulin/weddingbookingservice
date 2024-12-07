package com.javaacademy.weddingbookingservice.controller;

import com.javaacademy.weddingbookingservice.dto.BookingDto;
import com.javaacademy.weddingbookingservice.entity.Booking;
import com.javaacademy.weddingbookingservice.service.BookingService;
import java.time.Month;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {

  private final BookingService bookingService;

  @GetMapping("/booking/month/{monthNumber}")
  public List<BookingDto> getBookingForNumber(@PathVariable Month monthNumber) {
    return bookingService.getBookingForNumber(monthNumber);
  }

  @PostMapping("/booking")
  public void saveBooking(@RequestBody Booking booking) {
    bookingService.saveBooking(booking);
  }

  @GetMapping("/month/{monthNumber}/free")
  public Model getCountBookingDayOfMonth(Model model, @PathVariable Month monthNumber) {
    return model.addAttribute("count", bookingService.getCountBookingDayOfMonth(monthNumber));
  }
}
