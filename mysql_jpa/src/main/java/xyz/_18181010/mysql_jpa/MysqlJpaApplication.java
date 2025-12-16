package xyz._18181010.mysql_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MysqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[]) {
		return runner_args -> {
			System.out.println("command line runner started.");
		};
	}

}
