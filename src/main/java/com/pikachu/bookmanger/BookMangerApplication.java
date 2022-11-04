package com.pikachu.bookmanger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.pikachu.bookmanger.dao")
public class BookMangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMangerApplication.class, args);
	}

}
