package org.example.travelio.Exceptions;

public class InvalidStatusException extends RuntimeException {

    private final String invalidStatus;

    public InvalidStatusException(String invalidStatus) {
        super("Invalid status value: " + invalidStatus);
        this.invalidStatus = invalidStatus;
    }

    public String getInvalidStatus() {
        return invalidStatus;
    }
}