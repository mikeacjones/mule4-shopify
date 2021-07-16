package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariant {
    private final String barcode;
    private final String compare_at_price;
    private final DateTime created_at;
    private final String fulfillment_service;
    private final Integer grams;
    private final Integer id;
    private final Integer image_id;
    private final Integer inventory_item_id;
    private final String inventory_management;
    private final String inventory_policy;
    private final Integer inventory_quantity;
    private final String option;
    private final Integer position;
    private final String price;
    private final Integer product_id;
    private final String sku;
    private final Boolean taxable;
    private final String tax_code;
    private final String title;
    private final DateTime updated_at;
    private final Integer weight;
    private final String weight_unit;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ProductVariant(
            @JsonProperty("barcode") String barcode,
            @JsonProperty("compare_at_price") String compare_at_price,
            @JsonProperty("created_at") DateTime created_at,
            @JsonProperty("fulfillment_service") String fulfillment_service,
            @JsonProperty("grams") Integer grams,
            @JsonProperty("id") Integer id,
            @JsonProperty("image_id") Integer image_id,
            @JsonProperty("inventory_item_id") Integer inventory_item_id,
            @JsonProperty("inventory_management") String inventory_management,
            @JsonProperty("inventory_policy") String inventory_policy,
            @JsonProperty("inventory_quantity") Integer inventory_quantity,
            @JsonProperty("option") String option,
            @JsonProperty("position") Integer position,
            @JsonProperty("price") String price,
            @JsonProperty("product_id") Integer product_id,
            @JsonProperty("sku") String sku,
            @JsonProperty("taxable") Boolean taxable,
            @JsonProperty("tax_code") String tax_code,
            @JsonProperty("title") String title,
            @JsonProperty("updated_at") DateTime updated_at,
            @JsonProperty("weight") Integer weight,
            @JsonProperty("weight_unit") String weight_unit
    ) {
        this.barcode = barcode;
        this.compare_at_price = compare_at_price;
        this.created_at = created_at;
        this.fulfillment_service = fulfillment_service;
        this.grams = grams;
        this.id = id;
        this.image_id = image_id;
        this.inventory_item_id = inventory_item_id;
        this.inventory_management = inventory_management;
        this.inventory_policy = inventory_policy;
        this.inventory_quantity = inventory_quantity;
        this.option = option;
        this.position = position;
        this.price = price;
        this.product_id = product_id;
        this.sku = sku;
        this.taxable = taxable;
        this.tax_code = tax_code;
        this.title = title;
        this.updated_at = updated_at;
        this.weight = weight;
        this.weight_unit = weight_unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getCompare_at_price() {
        return compare_at_price;
    }

    public DateTime getCreated_at() {
        return created_at;
    }

    public String getFulfillment_service() {
        return fulfillment_service;
    }

    public Integer getGrams() {
        return grams;
    }

    public Integer getId() {
        return id;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public Integer getInventory_item_id() {
        return inventory_item_id;
    }

    public String getInventory_management() {
        return inventory_management;
    }

    public String getInventory_policy() {
        return inventory_policy;
    }

    public Integer getInventory_quantity() {
        return inventory_quantity;
    }

    public String getOption() {
        return option;
    }

    public Integer getPosition() {
        return position;
    }

    public String getPrice() {
        return price;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public String getSku() {
        return sku;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public String getTax_code() {
        return tax_code;
    }

    public String getTitle() {
        return title;
    }

    public DateTime getUpdated_at() {
        return updated_at;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }
}
