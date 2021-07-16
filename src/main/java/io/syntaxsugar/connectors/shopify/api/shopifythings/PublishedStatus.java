package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PublishedStatus {
    PUBLISHED("published"),
    UNPUBLISHED("unpublished"),
    ANY("any");

    private final String value;
    private PublishedStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() { return value; }
}
