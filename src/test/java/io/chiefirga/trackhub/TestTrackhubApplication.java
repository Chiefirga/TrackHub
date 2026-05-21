package io.chiefirga.trackhub;

import org.springframework.boot.SpringApplication;

public class TestTrackhubApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrackhubApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
