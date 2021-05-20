/*
 * @Author: your name
 * @Date: 2021-05-19 11:12:49
 * @LastEditTime: 2021-05-20 16:50:51
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \mysite\shy\src\main\java\com\shy\site\shy\ShyApplication.java
 */
package com.shy.site.shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class ShyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShyApplication.class, args);
	}
	

}
