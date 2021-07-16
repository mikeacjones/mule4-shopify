package io.syntaxsugar.connectors.shopify.internal.operations;

import java.io.IOException;

import io.syntaxsugar.connectors.shopify.api.shopifythings.*;
import io.syntaxsugar.connectors.shopify.api.connection.ShopifyService;

import org.joda.time.DateTime;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

import retrofit2.Call;
import retrofit2.Response;

public class AdminOperations {

  @DisplayName("Admin: Get Product Count")
  public Count getProductCount(@Connection ShopifyService client) throws IOException {
    Call<Count> getProductCountCall = client.getProductCount();
    Response<Count> getProductCountResponse = getProductCountCall.execute();
    if (!getProductCountResponse.isSuccessful())
      throw new IOException("Error occurred while getting product count");
    return getProductCountResponse.body();
  }

  @DisplayName("Admin: Get Products")
  public Product[] getProducts(
          @Connection ShopifyService client,
          @Optional @DisplayName("IDs (comma separated)") String ids,
          @Optional @DisplayName("Limit") Integer limit,
          @Optional @DisplayName("Since ID") Integer since_id,
          @Optional @DisplayName("Title") String title,
          @Optional @DisplayName("Vendor") String vendor,
          @Optional @DisplayName("Handles (comma separated)") String handle,
          @Optional @DisplayName("Product type") String product_type,
          @Optional @DisplayName("Status") Status status,
          @Optional @DisplayName("Collection ID") Integer collection_id,
          @Optional @DisplayName("Min Created At (ISO8601)") String created_at_min,
          @Optional @DisplayName("Max Created At (ISO8601)") String created_at_max,
          @Optional @DisplayName("Min Updated At (ISO8601)") String updated_at_min,
          @Optional @DisplayName("Max Updated At (ISO8601)") String updated_at_max,
          @Optional @DisplayName("Min Published At (ISO8601)") String published_at_min,
          @Optional @DisplayName("Max Published At (ISO8601)") String published_at_max,
          @Optional @DisplayName("Published Status") PublishedStatus published_status,
          @Optional @DisplayName("Fields (comma separated)") String fields
  ) throws IOException {
    Call<ProductCollection> getProductsCall = client.getProducts(
            ids, limit, since_id, title, vendor, handle, product_type, status,
            collection_id, created_at_min, created_at_max,
            updated_at_min, updated_at_max, published_at_min,
            published_at_max, published_status, fields
    );
    Response<ProductCollection> getProductsResponse = getProductsCall.execute();
    if (!getProductsResponse.isSuccessful())
      throw new IOException("Error occurred while getting products");
    return getProductsResponse.body().getProducts();
  }

}