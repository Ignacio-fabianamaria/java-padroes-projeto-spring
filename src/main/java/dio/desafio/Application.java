package dio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Este projeto Spring Boot faz parte do Desafio sobre padrões de projeto Spring Java do Bootcamp Santander & Digital Innovation One - JAVA.
 * Foi gerado usando o Spring Initializr e inclui os seguintes módulos:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * Autor: Ignacio-fabianamaria
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
