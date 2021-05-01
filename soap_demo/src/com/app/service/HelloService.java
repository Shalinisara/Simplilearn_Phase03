package com.app.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloService {
	
	@WebMethod
	String sayHello();
	
	@WebMethod
	String sayHelloByName(String name);
}
