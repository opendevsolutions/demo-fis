package ar.com.demo.services;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class ValidatorRouteBuilder extends BaseRouteBuilder {

  @Override
  public void addRoutes() throws Exception {

	  from("direct:demoSoap")
	     .setHeader(Exchange.HTTP_METHOD, constant("POST"))
	     .setHeader("Content-Type", constant("application/xml"))
	     .to("direct:callSSO")
	     .process("createRequestProcessor")
		 .to("cxf://{{demo.soap.endpoint}}?serviceClass=com.dataaccess.webservicesserver.TextCasingSoapType&wsdlURL={{wsdl.path.demo.validator}}")
		 .setHeader("Content-Type", constant("application/json"));
  }
  


}
