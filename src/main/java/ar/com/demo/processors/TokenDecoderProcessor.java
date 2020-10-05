package ar.com.demo.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

public class TokenDecoderProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        String token = (String) exchange.getIn().getHeader("Authorization");
        System.out.println("token: "+ token);
        if(token != null && token != "" && !token.contains("Basic")){
        	DecodedJWT jwt = JWT.decode(token);
	        System.out.println("token= " + jwt.toString());
        }
        exchange.getIn().setHeader("Authorization", token);
        exchange.getIn().removeHeader("Authorization");

    }
}
