package com.javaacademy.weddingbookingservice.entity;

import lombok.Data;

@Data
public class Booking {

  private final int month;
  private final int day;
  private boolean booked;
}
