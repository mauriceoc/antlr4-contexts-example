package org.antlrfun;

import java.util.HashMap;

public enum Error {

    INVALID_COMMAND("cmdName", "Invalid command specified"),
    INVALID_OPTION("nameValuePair", "Invalid option specified");

    private String rule;
    private String errorMessage;
    private static HashMap<String, Error> errorMap;

    private Error(String rule, String errorMessage) {
        this.rule = rule;
        this.errorMessage = errorMessage;
    }

    public static Error getError(String rule) {
        if(errorMap == null) {
            initErrorMap();
        }
        return errorMap.get(rule);
    }

    private static void initErrorMap() {
        errorMap = new HashMap<>();
        for(Error error : values()) {
            errorMap.put(error.rule, error);
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
