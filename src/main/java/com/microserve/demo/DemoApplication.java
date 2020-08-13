package com.microserve.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.Banner;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		new SpringApplicationBuilder().sources(DemoApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}

}
