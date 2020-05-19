package de.stuttgart.echoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchoServerApplication {

	public static void main(String[] args) {

		EchoServer server = new EchoServer();
		System.out.println("Server is up");
		server.run();

		SpringApplication.run(EchoServerApplication.class, args);
	}

}
