package org.example.travelio.DTO.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Step3Request {

    @NotNull(message = "Journey ID is required")
    private Long journeyId;

    @NotNull(message = "Interests are required")
    @Size(min = 1, max = 3, message = "Please select between 1 and 3 interests")
    private List<String> interests;

    public Step3Request() {}

    public Step3Request(Long journeyId, List<String> interests) {
        this.journeyId = journeyId;
        this.interests = interests;
    }

    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}