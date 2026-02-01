package org.example.travelio.Enums;

public enum JourneyStatus {
    START,
    IN_PROGRESS,
    COMPLETED;

    public String getValue() {
        return this.name();
    }
}