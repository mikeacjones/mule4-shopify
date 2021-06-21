package io.syntaxsugar.connectors.shopify.internal.operations;

import java.io.IOException;

import io.syntaxsugar.connectors.shopify.api.shopifythings.*;
import io.syntaxsugar.connectors.shopify.api.connection.ShopifyService;

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

}