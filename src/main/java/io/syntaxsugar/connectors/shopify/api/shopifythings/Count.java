package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Count {
  private final int count;

  @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
  public Count(@JsonProperty("count") final int count) {
    this.count = count;
  }

  public int getCount() { return this.count; }
}