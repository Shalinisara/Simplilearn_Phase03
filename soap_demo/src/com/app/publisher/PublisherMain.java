package com.app.publisher;

import javax.xml.ws.Endpoint;

import com.app.service.impl.HelloServiceImpl;

public class PublisherMain {
	
	public static void main(String[] args) 
	{
		String url="http://localhost:8080/hello";
		Endpoint.publish(url, new HelloServiceImpl());
		
		System.out.println("Hello your service is being published her, Shalini");
		System.out.println(url+"?wsdl");
	}
	

}
