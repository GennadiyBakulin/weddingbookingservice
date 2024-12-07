package com.javaacademy.weddingbookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDto {

  private int monthNumber;
  private int dayNumber;
  private boolean booked;
}
