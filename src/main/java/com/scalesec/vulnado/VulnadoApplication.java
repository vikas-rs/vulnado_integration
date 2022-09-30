package com.scalesec.vulnado;
#test.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class VulnadoApplication {
	public static void main(String[] args) {
		Postgres.setup();
		SpringApplication.run(VulnadoApplication.class, args);
	}
}
