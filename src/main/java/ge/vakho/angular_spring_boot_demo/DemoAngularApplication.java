package ge.vakho.angular_spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

/**
 * Excluding "UserDetailsServiceAutoConfiguration" removes auto-generated user. 
 * See here: https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/security/servlet/UserDetailsServiceAutoConfiguration.html
 */
@SpringBootApplication(exclude = { UserDetailsServiceAutoConfiguration.class })
public class DemoAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAngularApplication.class, args);
	}
}