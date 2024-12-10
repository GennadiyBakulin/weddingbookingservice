package com.javaacademy.weddingbookingservice.controller;

import com.javaacademy.weddingbookingservice.dto.BookingDtoRp;
import com.javaacademy.weddingbookingservice.dto.BookingDtoRq;
import com.javaacademy.weddingbookingservice.service.BookingService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

  private final BookingService bookingService;

  @PostMapping
  @ResponseStatus(value = HttpStatus.CREATED)
  public void save(@RequestBody BookingDtoRq bookingDtoRq) {
    bookingService.save(bookingDtoRq);
  }

  @GetMapping("/month/{monthNumber}")
  public List<BookingDtoRp> getByMonthNumber(@PathVariable int monthNumber) {
    return bookingService.getByMonthNumber(monthNumber);
  }

  @GetMapping("/month/{monthNumber}/free")
  public Map<String, Integer> getCountDayOfMonth(@PathVariable int monthNumber) {
    Map<String, Integer> map = new HashMap<>();
    map.put("count", bookingService.getCountDayOfMonth(monthNumber));
    return map;
  }
}
