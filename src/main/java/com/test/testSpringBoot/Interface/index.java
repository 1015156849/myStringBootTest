package com.test.testSpringBoot.Interface;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.testSpringBoot.Content.Keys;

@Controller
@RequestMapping("/")
public class index {


	public ModelAndView index1() {
		return new ModelAndView("index");
	}

}
