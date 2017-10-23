package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动类(入口)
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 上午9:22:52
 * @version 1.0
 */
@SpringBootApplication( // 把普通的java类转化成SpringBoot的启动类
		scanBasePackages={"cn.itcast.springboot"}) // 指定扫描的基础包
public class Application {

	public static void main(String[] args) {
		/** 运行SpringBoot的应用 (第一种方式) */
		//SpringApplication.run(Application.class, args);
		
		/** 运行SpringBoot的应用 (第二种方式) 去掉Banner */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置Banner横幅为关闭 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}