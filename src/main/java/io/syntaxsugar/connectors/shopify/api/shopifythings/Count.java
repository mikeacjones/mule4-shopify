package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.primitives.UnsignedInteger;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Count {
  private final UnsignedInteger count;

  @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
  public Count(@JsonProperty("count") final UnsignedInteger count) {
    this.count = count;
  }

  public UnsignedInteger getCount() { return this.count; }
}