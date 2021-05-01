package com.app.service.impl;

import javax.jws.WebService;

import com.app.service.HelloService;

@WebService(endpointInterface = "com.app.service.HelloService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to SOAP web services using java JAX WS";
	}

	@Override
	public String sayHelloByName(String name) {
		// TODO Auto-generated method stub
		return "Welcome"+name+" to SOAP web services using JAX WS" ;
	}

}
