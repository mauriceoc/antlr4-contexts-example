package org.antlrfun;

import java.util.HashMap;

public enum Error {

    INVALID_COMMAND("cmdName", "Invalid command specified"),
    INVALID_OPTION("option", "Invalid option specified"),
    INVALID_VALUE("value", "Invalid value specified"),
    INVALID_NAME("name", "Invalid name specified");

    private String rule;
    private String errorMessage;

    private Error(String rule, String errorMessage) {
        this.rule = rule;
        this.errorMessage = errorMessage;
    }

    public static Error getError(String rule) {
        Error errorToReturn = null;
        for(Error error : values()) {
            if(error.rule.equals(rule)) {
                errorToReturn = error;       
            }
        }
        return errorToReturn;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
