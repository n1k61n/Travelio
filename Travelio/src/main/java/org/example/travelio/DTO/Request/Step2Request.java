package org.example.travelio.DTO.Request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.example.travelio.Enums.TravelWith;

public class Step2Request {

    @NotNull(message = "Journey ID is required")
    private Long journeyId;

    @NotNull(message = "Travel with is required")
    private TravelWith travelWith;

    @NotNull(message = "Adults count is required")
    @Min(value = 1, message = "At least 1 adult is required")
    private Long adultsCount;

    // Only required when travelWith is FAMILY
    @Min(value = 0, message = "Children count cannot be negative")
    private Long childrenCount;

    public Step2Request() {}

    public Step2Request(Long journeyId, TravelWith travelWith, Long adultsCount, Long childrenCount) {
        this.journeyId = journeyId;
        this.travelWith = travelWith;
        this.adultsCount = adultsCount;
        this.childrenCount = childrenCount;
    }

    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
    }

    public TravelWith getTravelWith() {
        return travelWith;
    }

    public void setTravelWith(TravelWith travelWith) {
        this.travelWith = travelWith;
    }

    public Long getAdultsCount() {
        return adultsCount;
    }

    public void setAdultsCount(Long adultsCount) {
        this.adultsCount = adultsCount;
    }

    public Long getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Long childrenCount) {
        this.childrenCount = childrenCount;
    }
}