package io.syntaxsugar.connectors.shopify.api.connection;

import io.syntaxsugar.connectors.shopify.api.shopifythings.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface ShopifyService {
  @GET("/admin/api/2021-04/products/count.json")
  Call<Count> getProductCount();

  @GET("/admin/api/2021-04/products.json")
  Call<ProductCollection> getProducts(
    @Query("ids") final String ids,
    @Query("limit") final Integer limit,
    @Query("since_id") final Integer id,
    @Query("title") final String title,
    @Query("vendor") final String vendor,
    @Query("handle") final String handle,
    @Query("product_type") final String product_type,
    @Query("status") final Status status,
    @Query("collection_id") final Integer collection_id,
    @Query("created_at_min") final String created_at_min,
    @Query("created_at_max") final String created_at_max,
    @Query("updated_at_min") final String updated_at_min,
    @Query("updated_at_max") final String updated_at_max,
    @Query("published_at_min") final String published_at_min,
    @Query("published_at_max") final String published_at_max,
    @Query("published_status") final PublishedStatus published_status,
    @Query("fields") final String fields
  );
}
