package com.javaacademy.weddingbookingservice.entity;

import java.time.MonthDay;
import lombok.Data;

@Data
public class Booking {

  private MonthDay monthDay;
  private boolean booked;

  public Booking(int month, int day) {
    this.monthDay = MonthDay.of(month, day);
  }
}
