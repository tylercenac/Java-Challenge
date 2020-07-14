package com.ibm.br.cic.internship.covid.exception;

import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class ErrorResponse {

    private String message;
    private List<String> details;

    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
}
