package io.syntaxsugar.connectors.shopify.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

import io.syntaxsugar.connectors.shopify.internal.connection.ShopifyConnectionProvider;
import io.syntaxsugar.connectors.shopify.internal.operations.AdminOperations;

@Xml(prefix = "shopify")
@Extension(name = "Shopify")
@ConnectionProviders({ ShopifyConnectionProvider.class })
@Operations({ AdminOperations.class })
public class ShopifyConnector {
}
