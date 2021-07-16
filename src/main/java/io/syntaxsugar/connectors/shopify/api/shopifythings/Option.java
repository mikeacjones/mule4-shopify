package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Option {
    private final int id;
    private final int product_id;
    private final String name;
    private final int position;
    private final String[] values;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Option(
            @JsonProperty("id") int id,
            @JsonProperty("product_id") int product_id,
            @JsonProperty("name") String name,
            @JsonProperty("position") int position,
            @JsonProperty("values") String[] values
    ) {
        this.id = id;
        this.product_id = product_id;
        this.name = name;
        this.position = position;
        this.values = values;
    }

    public int getId() {
        return id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String[] getValues() {
        return values;
    }
}
