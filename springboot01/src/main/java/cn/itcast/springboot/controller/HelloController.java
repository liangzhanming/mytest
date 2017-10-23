package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.UserService;

/**
 * HelloController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 上午9:44:02
 * @version 1.0
 */
@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;
	/** 注入属性文件中的所有属性 */
	@Autowired
	private Environment environment;
	/** 注入属性文件中单个的属性 */
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	/** 配置请求地址(GET请求) */
	@GetMapping("/hello")
	public String hello(){
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		System.out.println(name + "---->" + url);
		userService.save();
		
		return "Hello Spring Boot!";
	}
}
