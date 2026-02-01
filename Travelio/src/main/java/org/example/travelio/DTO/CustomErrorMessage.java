package org.example.travelio.DTO;

import java.time.LocalDateTime;

public class CustomErrorMessage {

    private String errorCode;
    private String message;
    private String timestamp;

    public CustomErrorMessage() {
        this.timestamp = LocalDateTime.now().toString();
    }

    public CustomErrorMessage(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
        this.timestamp = LocalDateTime.now().toString();
    }

    // Static factory methods for common errors
    public static CustomErrorMessage notFound(String resource, Long id) {
        return new CustomErrorMessage(
                "NOT_FOUND",
                resource + " not found with id: " + id
        );
    }

    public static CustomErrorMessage badRequest(String message) {
        return new CustomErrorMessage("BAD_REQUEST", message);
    }

    public static CustomErrorMessage journeyCompleted() {
        return new CustomErrorMessage(
                "JOURNEY_COMPLETED",
                "Journey has already been completed"
        );
    }

    public static CustomErrorMessage invalidStep(Integer expectedStep, Integer currentStep) {
        return new CustomErrorMessage(
                "INVALID_STEP",
                "Expected step " + expectedStep + " but journey is at step " + currentStep
        );
    }

    public static CustomErrorMessage validationError(String message) {
        return new CustomErrorMessage("VALIDATION_ERROR", message);
    }

    // Getters and Setters
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}