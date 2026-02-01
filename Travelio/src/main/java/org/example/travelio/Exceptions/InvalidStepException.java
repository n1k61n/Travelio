package org.example.travelio.Exceptions;

public class InvalidStepException extends RuntimeException {

    private final Long expectedStep;
    private final Long currentStep;

    public InvalidStepException(Long expectedStep, Long currentStep) {
        super("Invalid step: expected step " + expectedStep + " but journey is at step " + currentStep);
        this.expectedStep = expectedStep;
        this.currentStep = currentStep;
    }

    public Long getExpectedStep() {
        return expectedStep;
    }

    public Long getCurrentStep() {
        return currentStep;
    }
}