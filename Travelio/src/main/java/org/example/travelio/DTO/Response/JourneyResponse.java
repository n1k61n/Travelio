package org.example.travelio.DTO.Response;

import org.example.travelio.Entities.Journey;
import org.example.travelio.Enums.BudgetType;
import org.example.travelio.Enums.JourneyStatus;
import org.example.travelio.Enums.TravelStyle;
import org.example.travelio.Enums.TravelWith;

import java.time.LocalDateTime;
import java.util.List;

public class JourneyResponse {

    private Long id;
    private JourneyStatus status;
    private Long currentStep;
    private Long totalSteps;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Step 1
    private TravelStyle travelStyle;

    // Step 2
    private TravelWith travelWith;
    private Long adultsCount;
    private Long childrenCount;

    // Step 3
    private List<String> interests;

    // Step 4
    private BudgetType budgetType;
    private Long tripDays;

    public JourneyResponse() {}

    public static JourneyResponse fromEntity(Journey journey) {
        JourneyResponse response = new JourneyResponse();
        response.setId(journey.getId());
        response.setStatus(journey.getStatus());
        response.setCurrentStep(journey.getCurrentStep());
        response.setTotalSteps(Journey.MAX_STEPS);
        response.setCreatedAt(journey.getCreatedAt());
        response.setUpdatedAt(journey.getUpdatedAt());
        response.setTravelStyle(journey.getTravelStyle());
        response.setTravelWith(journey.getTravelWith());
        response.setAdultsCount(journey.getAdultsCount());
        response.setChildrenCount(journey.getChildrenCount());
        response.setInterests(journey.getInterests());
        response.setBudgetType(journey.getBudgetType());
        response.setTripDays(journey.getTripDays());
        return response;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JourneyStatus getStatus() {
        return status;
    }

    public void setStatus(JourneyStatus status) {
        this.status = status;
    }

    public Long getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Long currentStep) {
        this.currentStep = currentStep;
    }

    public Long getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Long totalSteps) {
        this.totalSteps = totalSteps;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TravelStyle getTravelStyle() {
        return travelStyle;
    }

    public void setTravelStyle(TravelStyle travelStyle) {
        this.travelStyle = travelStyle;
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    public Long getTripDays() {
        return tripDays;
    }

    public void setTripDays(Long tripDays) {
        this.tripDays = tripDays;
    }
}