package ar.com.demo.services;

import org.apache.camel.Exchange;
import org.apache.camel.component.http.HttpMethods;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class SsoRouteBuilder extends BaseRouteBuilder {

  @Override
  public void addRoutes() throws Exception {

	  from("direct:callSSO")
		.setHeader("pathBkp", simple("${header.CamelHttpPath}"))
		.setHeader("bodyBkp", simple("${bodyAs(String)}"))
		.setProperty("fileBkp", simple("${header.file}"))
		.setBody().simple("client_id={{sso.login.clientId}}&client_secret={{sso.login.clientSecret}}&grant_type=password&username=${header.user}&password=${header.pass}")
		.removeHeader(Exchange.HTTP_PATH)
		.removeHeader("file")
		.to("log:DEBUG?showAll=true")
		.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.POST))
		.setHeader(Exchange.CONTENT_TYPE, simple("application/x-www-form-urlencoded"))
		.to("https4://{{sso.login.url}}?bridgeEndpoint=true")
		.unmarshal(new JacksonDataFormat(Object.class))
		.setHeader("token", simple("${body[access_token]}"))
		.setHeader(Exchange.HTTP_PATH, simple("${header.pathBkp}"))
		.setHeader("file", simple("${property.fileBkp}"))
		.setBody(simple("${header.fileBkp}"));
  }
  


}
