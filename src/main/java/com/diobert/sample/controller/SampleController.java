package com.diobert.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diobert.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@RequestMapping("/sample")
	public @ResponseBody String getService() {
		String result=null;
		result = sampleService.getService();
		return result;
	}

}
