package com.onlyclothes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //es una exclusion para correr el programa 
public class OnlyClothesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlyClothesApplication.class, args);
	}

}
