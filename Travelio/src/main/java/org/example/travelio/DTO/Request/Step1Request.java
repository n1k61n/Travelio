package org.example.travelio.DTO.Request;

import jakarta.validation.constraints.NotNull;
import org.example.travelio.Enums.TravelStyle;

public class Step1Request {

    @NotNull(message = "Journey ID is required")
    private Long journeyId;

    @NotNull(message = "Travel style is required")
    private TravelStyle travelStyle;

    public Step1Request() {}

    public Step1Request(Long journeyId, TravelStyle travelStyle) {
        this.journeyId = journeyId;
        this.travelStyle = travelStyle;
    }

    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
    }

    public TravelStyle getTravelStyle() {
        return travelStyle;
    }

    public void setTravelStyle(TravelStyle travelStyle) {
        this.travelStyle = travelStyle;
    }
}