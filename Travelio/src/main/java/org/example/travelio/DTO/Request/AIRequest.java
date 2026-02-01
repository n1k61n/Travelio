package org.example.travelio.DTO.Request;

import lombok.Data;

import java.util.List;

@Data
public class AIRequest {
    String travelStyle;
    String travelWith;
    long adultsCount;
    long childrenCount;
    List<String> interests;
    String budgetType;
    Long tripDays;
    private String currency;
}
