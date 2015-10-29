package com.circuit.trip.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	@RequestMapping("api")
	@ResponseBody
	public String api(){
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("message","Welcome to Circuit Trip 0.1");
		return jsonObj.toString();
	}
}
