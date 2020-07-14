package com.ibm.br.cic.internship.covid.exception;

/**
 * @author JamieRichardson
 */
public class MissingHeaderException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MissingHeaderException(String exception) {
        super(exception);
    }
}
