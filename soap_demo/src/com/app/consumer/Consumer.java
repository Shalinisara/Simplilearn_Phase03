package com.app.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.app.service.HelloService;

public class Consumer {

	public static void main(String[] args)  {
		String endpoint = "http://localhost:8080/hello?wsdl";
		try {
			URL url = new URL(endpoint);
			QName qname = new QName("http://impl.service.app.com/", "HelloServiceImplService");
			/*
			 * Parm 1 is xmls:tns (target name space)
			 * Parm 2 is the service name which is associated with the name attribute in the same tag
			 */
			Service service= Service.create(url,qname);
			HelloService helloservice=service.getPort(HelloService.class);
			System.out.println("Accessing services in client side");
			System.out.println(helloservice.sayHello());
			System.out.println(helloservice.sayHelloByName("SHALINI"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
;