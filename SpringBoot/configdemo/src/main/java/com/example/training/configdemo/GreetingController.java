package com.example.training.configdemo;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GreetingController {
	
	@Autowired
	GreetingConfiguration greetingConfig;
	
	@Value("${greetingconfig.filePath}")
	String filePath;
	
	@RequestMapping(path = "/greet", method=RequestMethod.GET)
	public ResponseEntity<String> readFile() {
		ResponseEntity response = null;
		try {
			char data[] = new char[50];
			FileReader reader = new FileReader(filePath);
			reader.read(data);
			reader.close();
			String responseData = new String(data);
			response = new ResponseEntity<String>(responseData, HttpStatus.OK);
			return response;
		} catch (Exception e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}
	}
}


