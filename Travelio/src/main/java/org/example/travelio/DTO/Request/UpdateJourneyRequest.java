package org.example.travelio.DTO.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateJourneyRequest {

    @NotNull(message = "Journey ID is required")
    private Long id;

    @NotBlank(message = "Status is required")
    private String status;

    public UpdateJourneyRequest() {}

    public UpdateJourneyRequest(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}