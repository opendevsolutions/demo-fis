package ar.com.demo.services;

import org.springframework.stereotype.Component;

@Component
public class SendInternalApiRouteBuilder extends BaseRouteBuilder {

  @Override
  public void addRoutes() throws Exception {

		/*
		 * from("direct:sendInternalServices") .to("direct:callSSO")
		 * .setHeader(Exchange.HTTP_METHOD, constant("GET")) .setHeader("Content-Type",
		 * constant("application/json")) .setBody().simple("") .to(
		 * "http4://{{internal.servece.host}}/?bridgeEndpoint=true&amp;throwExceptionOnFailure=false"
		 * );
		 */
  }
  


}
