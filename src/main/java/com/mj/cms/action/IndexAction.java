package com.mj.cms.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author zhouping
 * @version 1.0.0
 *
 */
@Controller
public class IndexAction {
	@RequestMapping(value = "/", method = RequestMethod.GET)  
	public String index(){
		return "index";
		
		
	}
}
