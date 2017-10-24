package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 上午11:24:54
 * @version 1.0
 */
@Controller
public class UserController {
	
	@GetMapping("/hello")
	public String hello(){
		return "html/hello.html";
	}
}
