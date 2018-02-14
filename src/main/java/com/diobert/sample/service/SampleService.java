package com.diobert.sample.service;

import org.springframework.stereotype.Service;

@Service	
public class SampleService {
	
	public String getService() {
		String result = "sample";
		return result;
	}

}
