package com.mijiaokj.sys.controller.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunchenguang
 * @mail scg16@126.com
 * 错误跳转
 */
@Controller
public class MijiaoErrorController implements ErrorController {

	private static final String ERROR_PATH = "/error";
	
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

	@RequestMapping(value=ERROR_PATH)
    public String handleError(ModelMap map){
		map.put("message", "message");
        return "error";
    }
	 
}