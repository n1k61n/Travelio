package org.example.travelio.Exceptions;

public class JourneyNotFoundException extends RuntimeException {

    private final Long journeyId;

    public JourneyNotFoundException(Long journeyId) {
        super("Journey not found with id: " + journeyId);
        this.journeyId = journeyId;
    }

    public Long getJourneyId() {
        return journeyId;
    }
}