package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCollection {
    private final Product[] products;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ProductCollection(@JsonProperty("products") Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }
}
