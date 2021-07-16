package io.syntaxsugar.connectors.shopify.api.shopifythings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private final String body_html;
    private final DateTime created_at;
    private final String handle;
    private final Integer id;
    private final ProductImage[] images;
    private final Option[] options;
    private final String product_type;
    private final DateTime published_at;
    private final String published_scope;
    private final String status;
    private final String tags;
    private final String template_suffix;
    private final String title;
    private final DateTime updated_at;
    private final ProductVariant[] variants;
    private final String vendor;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Product(
            @JsonProperty("body_html") String body_html,
            @JsonProperty("created_at") DateTime created_at,
            @JsonProperty("handle") String handle,
            @JsonProperty("id") Integer id,
            @JsonProperty("images") ProductImage[] images,
            @JsonProperty("options") Option[] options,
            @JsonProperty("product_type") String product_type,
            @JsonProperty("published_at") DateTime published_at,
            @JsonProperty("published_scope") String published_scope,
            @JsonProperty("status") String status,
            @JsonProperty("tags") String tags,
            @JsonProperty("template_suffix") String template_suffix,
            @JsonProperty("title") String title,
            @JsonProperty("updated_at") DateTime updated_at,
            @JsonProperty("variants") ProductVariant[] variants,
            @JsonProperty("vendor") String vendor
    ) {
        this.body_html = body_html;
        this.created_at = created_at;
        this.handle = handle;
        this.id = id;
        this.images = images;
        this.options = options;
        this.product_type = product_type;
        this.published_at = published_at;
        this.published_scope = published_scope;
        this.status = status;
        this.tags = tags;
        this.template_suffix = template_suffix;
        this.title = title;
        this.updated_at = updated_at;
        this.variants = variants;
        this.vendor = vendor;
    }

    public String getBody_html() {
        return body_html;
    }

    public DateTime getCreated_at() {
        return created_at;
    }

    public String getHandle() {
        return handle;
    }

    public Integer getId() {
        return id;
    }

    public ProductImage[] getImages() {
        return images;
    }

    public Option[] getOptions() {
        return options;
    }

    public String getProduct_type() {
        return product_type;
    }

    public DateTime getPublished_at() {
        return published_at;
    }

    public String getPublished_scope() {
        return published_scope;
    }

    public String getStatus() {
        return status;
    }

    public String getTags() {
        return tags;
    }

    public String getTemplate_suffix() {
        return template_suffix;
    }

    public String getTitle() {
        return title;
    }

    public DateTime getUpdated_at() {
        return updated_at;
    }

    public ProductVariant[] getVariants() {
        return variants;
    }

    public String getVendor() {
        return vendor;
    }
}
