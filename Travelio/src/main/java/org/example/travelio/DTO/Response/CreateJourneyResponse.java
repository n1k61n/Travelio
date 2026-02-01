package org.example.travelio.DTO.Response;

import org.example.travelio.Entities.Journey;
import org.example.travelio.Enums.JourneyStatus;

import java.time.LocalDateTime;

public class CreateJourneyResponse {

    private Long id;
    private String status;
    private Long currentStep;
    private String createdAt;

    public CreateJourneyResponse() {}

    public CreateJourneyResponse(Long id, JourneyStatus status, Long currentStep, LocalDateTime createdAt) {
        this.id = id;
        this.status = status.getValue();
        this.currentStep = currentStep;
        this.createdAt = createdAt.toString();
    }

    // Static factory method for cleaner code
    public static CreateJourneyResponse fromEntity(Journey journey) {
        return new CreateJourneyResponse(
                journey.getId(),
                journey.getStatus(),
                journey.getCurrentStep(),
                journey.getCreatedAt()
        );
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Long getCurrentStep() {
        return currentStep;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    // Setters (for serialization)
    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrentStep(Long currentStep) {
        this.currentStep = currentStep;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}