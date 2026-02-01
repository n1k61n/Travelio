package org.example.travelio.Exceptions;

public class JourneyAlreadyCompletedException extends RuntimeException {

    private final Long journeyId;

    public JourneyAlreadyCompletedException(Long journeyId) {
        super("Journey with id: " + journeyId + " has already been completed");
        this.journeyId = journeyId;
    }

    public Long getJourneyId() {
        return journeyId;
    }
}