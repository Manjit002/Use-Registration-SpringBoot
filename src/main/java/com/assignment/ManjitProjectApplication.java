package com.assignment;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class ManjitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManjitProjectApplication.class, args);
		System.err.println(new Date());
	}

}
