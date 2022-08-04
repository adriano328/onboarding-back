package com.totem.api.onboardingbackend;

import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class OnboardingBackEndApplication {

		public static void main(String[] args) {
		SpringApplication.run(OnboardingBackEndApplication.class, args);
	}


}
