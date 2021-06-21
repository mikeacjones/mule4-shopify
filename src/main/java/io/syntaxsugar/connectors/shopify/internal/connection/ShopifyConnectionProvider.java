package io.syntaxsugar.connectors.shopify.internal.connection;

import java.io.IOException;

import org.mule.runtime.api.connection.CachedConnectionProvider;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

import io.syntaxsugar.connectors.shopify.api.connection.ShopifyService;
import io.syntaxsugar.connectors.shopify.api.connection.BasicAuthInterceptor;
import io.syntaxsugar.connectors.shopify.api.shopifythings.Count;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ShopifyConnectionProvider implements CachedConnectionProvider<ShopifyService> {

  @Parameter
  @Password
  @Placement(order = 1)
  @DisplayName("API Key")
  private String apiKey;

  @Parameter
  @Password
  @Placement(order = 2)
  @DisplayName("Password")
  private String password;

  @Parameter
  @Placement(order = 3)
  @DisplayName("Store URL (eg: https://mulesoft.my-shopify.com")
  private String storeUrl;

  @Override
  public ShopifyService connect() throws ConnectionException {
    Retrofit retrofit = 
      new Retrofit.Builder()
          .baseUrl(storeUrl)
          .addConverterFactory(JacksonConverterFactory.create())
          .client(new OkHttpClient.Builder()
            .addInterceptor(new BasicAuthInterceptor(apiKey, password))
            .build()
          )
          .build();

    return retrofit.create(ShopifyService.class);
  }

  @Override
  public void disconnect(ShopifyService service) {}

  @Override
  public ConnectionValidationResult validate(ShopifyService service) {
    Call<Count> countCall = service.getProductCount();
    try {
      Response<Count> countResponse = countCall.execute();
      if (!countResponse.isSuccessful())
        return ConnectionValidationResult.failure("Connection failed", null);
      return ConnectionValidationResult.success();
    } catch (IOException e) {
      return ConnectionValidationResult.failure("Connection failed", e);
    }
  }

}