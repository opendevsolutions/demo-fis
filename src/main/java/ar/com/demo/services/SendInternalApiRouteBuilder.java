package ar.com.demo.services;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class SendInternalApiRouteBuilder extends BaseRouteBuilder {

  @Override
  public void addRoutes() throws Exception {

	  from("direct:sendInternalServices")
	  	 .to("direct:callSSO")
	     .setHeader(Exchange.HTTP_METHOD, constant("GET"))
	     .setHeader("Content-Type", constant("application/json"))
		 .to("http4://{{internal.servece.host}}/?bridgeEndpoint=true&amp;throwExceptionOnFailure=false")
		 .setHeader("Content-Type", constant("application/json"));
  }
  


}
