package com.javaacademy.weddingbookingservice.storage;

import com.javaacademy.weddingbookingservice.entity.Booking;
import lombok.Getter;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.springframework.stereotype.Component;

@Component
public class BookingStorage {

  @Getter
  private final MultiValuedMap<Integer, Booking> data = new ArrayListValuedHashMap<>();
}
