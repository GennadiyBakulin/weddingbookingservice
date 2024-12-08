package com.javaacademy.weddingbookingservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class Booking {

  private int month;
  private int day;
  @JsonIgnoreProperties
  private boolean booked;
}
