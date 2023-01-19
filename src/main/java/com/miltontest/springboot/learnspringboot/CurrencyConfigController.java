package com.miltontest.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController 
{
	@Autowired
	private CurrencyServiceConfiguration config;
  
  @RequestMapping("/currency-config")
	public CurrencyServiceConfiguration retrieveAllCourses()
	{
    return config;
	}

}
