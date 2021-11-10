package com.cogent.productexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	// authentication
	// authentication
		@Override
		public void configure(AuthenticationManagerBuilder auth) 
				throws Exception {
			auth.inMemoryAuthentication().withUser("Dimple")
					.password("{noop}Dimple").roles("ADMIN");
			auth.inMemoryAuthentication().withUser
			("user1").password("{noop}user1").
			roles("USER");
		}
		/*@Bean
		public PasswordEncoder passwordEncoder() {
		    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
		}*
	/*
	 * http://localhost:8080/
	 * http://localhost:8080/emp
	 * http://localhost:8080/newmep
	 */
		// authorication
		@Override
		public void configure(HttpSecurity http) throws Exception {
			http.antMatcher("/**").authorizeRequests().anyRequest().
			hasRole("USER")
					.and().formLogin().loginPage("/loginD")
					.failureUrl("/loginD?error=1").
					loginProcessingUrl("/login")
					.permitAll().and().logout()
					.logoutSuccessUrl("/showNewProductForm");

		}
}
