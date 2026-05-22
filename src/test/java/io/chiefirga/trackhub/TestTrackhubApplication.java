package io.chiefirga.trackhub;

import org.springframework.boot.SpringApplication;

public class TestTrackhubApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrackHubApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
