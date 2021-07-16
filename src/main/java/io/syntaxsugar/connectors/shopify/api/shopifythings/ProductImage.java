package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.primitives.UnsignedInteger;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductImage {

  private final DateTime created_at;
  private final UnsignedInteger id;
  private final Integer position;
  private final UnsignedInteger product_id;
  private final UnsignedInteger[] variant_ids;
  private final String src;
  private final Integer width;
  private final Integer height;
  private final DateTime updated_at;

  @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
  public ProductImage(
    @JsonProperty("created_at") DateTime created_at,
    @JsonProperty("id") UnsignedInteger id,
    @JsonProperty("position") Integer position,
    @JsonProperty("product_id") UnsignedInteger product_id,
    @JsonProperty("variant_ids") UnsignedInteger[] variant_ids,
    @JsonProperty("src") String src,
    @JsonProperty("width") Integer width,
    @JsonProperty("height") Integer height,
    @JsonProperty("updated_at") DateTime updated_at
  ) {
    this.created_at = created_at;
    this.id = id;
    this.position = position;
    this.product_id = product_id;
    this.variant_ids = variant_ids;
    this.src = src;
    this.width = width;
    this.height = height;
    this.updated_at = updated_at;
  }

  public DateTime getCreated_at() {
    return created_at;
  }

  public UnsignedInteger getId() {
    return id;
  }

  public Integer getPosition() {
    return position;
  }

  public UnsignedInteger getProduct_id() {
    return product_id;
  }

  public UnsignedInteger[] getVariant_ids() {
    return variant_ids;
  }

  public String getSrc() {
    return src;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getHeight() {
    return height;
  }

  public DateTime getUpdated_at() {
    return updated_at;
  }
}
