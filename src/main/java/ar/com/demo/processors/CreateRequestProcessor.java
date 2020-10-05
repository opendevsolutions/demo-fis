package ar.com.demo.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateRequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		List<Object> listRequest = new ArrayList<>();
    	listRequest.add(exchange.getIn().getHeader("string", String.class));
    	listRequest.add(exchange.getIn().getHeader("token", String.class));
    	System.out.println("Token: "+ exchange.getIn().getHeader("token", String.class));
    	exchange.getIn().setBody(listRequest);
	}
}
