package com.javaacademy.weddingbookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDtoRq {

  private int month;
  private int day;
}
