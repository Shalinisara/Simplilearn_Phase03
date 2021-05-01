package com.app.service.impl;

import com.app.service.Appservice;

public class AppServiceImpl implements Appservice {
	
	public boolean isValidEvenNumber(int n) {
		
		return (n%2)==0;
	}

	public boolean isValidPrimeNumber(int n) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}

	public boolean isValidMobileNumber(String contact) {
		boolean b=false;
		if(contact!=null && contact.matches("\\+1-[0-9]{10}")) {
			b=true;
		}
		
		return b;
	}
	
	             

}
