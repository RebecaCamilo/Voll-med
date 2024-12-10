package med.voll.api;

import med.voll.api.infra.security.SecurityConfigurations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run(PasswordEncoder passwordEncoder) {
//		return args -> {
//			// Senha original
//			String rawPassword = "teste";
//
//			// Criptografar a senha
//			String encodedPassword = passwordEncoder.encode(rawPassword);
//
//			// Imprimir a senha original e criptografada no console
//			System.out.println("Senha original: " + rawPassword);
//			System.out.println("Senha criptografada: " + encodedPassword);
//		};
//	}

}
