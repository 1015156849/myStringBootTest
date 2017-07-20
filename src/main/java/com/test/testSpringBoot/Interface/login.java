package com.test.testSpringBoot.Interface;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.testSpringBoot.Content.Keys;

@RestController
public class login {

	@RequestMapping(value="/main")
	public Map<String,Object> login2Main(String key){
		
		HashMap<String,Object> h=new HashMap<String, Object>();
		if(key.equals(Keys.KEY)){
			
			ModelAndView a=new ModelAndView("main");
			h.put("RESULT",true);
			h.put("model", a);
			return h;
		}
		h.put("RESULT",false);
		return h;
	}
	
	@RequestMapping(value="/login")
	public Map<String,Object> login(String USERNAME,String PASSWORD){
		
		HashMap<String,Object> h=new HashMap<String, Object>();
		if(USERNAME.equals(Keys.USERNAME)&&PASSWORD.equals(Keys.PASSWORD)){
			
			Keys.KEY=new Date().toString();
			h.put("RESULT",true);
			h.put("key", Keys.KEY);
			return h;
		}
		h.put("RESULT",false);
		return h;
	}
}
