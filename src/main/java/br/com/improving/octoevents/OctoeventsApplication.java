package br.com.improving.octoevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br")
public class OctoeventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctoeventsApplication.class, args);
	}

}
