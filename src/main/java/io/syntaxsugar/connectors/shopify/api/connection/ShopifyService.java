package io.syntaxsugar.connectors.shopify.api.connection;

import retrofit2.Call;
import retrofit2.http.*;
import io.syntaxsugar.connectors.shopify.api.shopifythings.*;

public interface ShopifyService {

  @GET("/admin/api/2021-04/products/count.json")
  Call<Count> getProductCount();

}