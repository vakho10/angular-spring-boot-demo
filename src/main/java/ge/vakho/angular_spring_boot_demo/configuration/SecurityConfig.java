package ge.vakho.angular_spring_boot_demo.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// Write your custom security... 
		http.authorizeRequests().anyRequest().permitAll();
		
		// Angular doesn't work with CSRF enabled
		http.csrf().disable();
	}

}