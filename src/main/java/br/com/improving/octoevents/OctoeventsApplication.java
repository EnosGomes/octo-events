package br.com.improving.octoevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"br.com.improving.octoevents"})
public class OctoeventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctoeventsApplication.class, args);
	}

}
