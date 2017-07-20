package com.test.testSpringBoot.Interface;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	 	
	@RequestMapping("/test1")
	public Map<String,Object> testGet(String key){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("key", key);
		map.put("time",sdf.format(new Date()) );
		return map;
	}
}
