package com.javaacademy.weddingbookingservice.storage;

import com.javaacademy.weddingbookingservice.entity.Booking;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class BookingStorage {

  private final Map<Integer, List<Booking>> data = new HashMap<>();
}
