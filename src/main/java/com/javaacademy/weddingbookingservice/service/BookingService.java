package com.javaacademy.weddingbookingservice.service;

import com.javaacademy.weddingbookingservice.dto.BookingDtoRp;
import com.javaacademy.weddingbookingservice.dto.BookingDtoRq;
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

  public void save(BookingDtoRq bookingDtoRq) {
    bookingRepository.save(bookingMapper.convertToEntity(bookingDtoRq));
  }

  public List<BookingDtoRp> getByMonthNumber(int monthNumber) {
    return bookingRepository.getByMonthNumber(monthNumber).stream()
        .map(bookingMapper::convertToDto)
        .toList();
  }

  public int getCountDayOfMonth(int monthNumber) {
    return bookingRepository.getCountDayOfMonth(monthNumber);
  }
}
