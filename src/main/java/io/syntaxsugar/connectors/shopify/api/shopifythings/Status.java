package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ACTIVE("active"),
    ARCHIVED("archived"),
    DRAFT("any");

    private final String value;
    private Status(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() { return value; }
}
