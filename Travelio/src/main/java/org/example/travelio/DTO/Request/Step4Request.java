package org.example.travelio.DTO.Request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.example.travelio.Enums.BudgetType;

public class Step4Request {

    @NotNull(message = "Journey ID is required")
    private Long journeyId;

    @NotNull(message = "Budget type is required")
    private BudgetType budgetType;

    @NotNull(message = "Trip days is required")
    @Min(value = 1, message = "Minimum trip duration is 1 day")
    @Max(value = 30, message = "Maximum trip duration is 30 days")
    private Long tripDays;

    public Step4Request() {}

    public Step4Request(Long journeyId, BudgetType budgetType, Long tripDays) {
        this.journeyId = journeyId;
        this.budgetType = budgetType;
        this.tripDays = tripDays;
    }

    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
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