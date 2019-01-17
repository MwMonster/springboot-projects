package com.mw.monster.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MwMonster
 * @Description SpringBoot项目启动类
 * @date
 */
@SpringBootApplication
@RestController
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}

	/**
	 * 访问http://localhost:8080/   即可在页面显示Hello World!
	 * @return
	 */
	@RequestMapping("/")
	public String helloWorld(){
		return "Hello World!";
	}


}

