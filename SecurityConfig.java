package com.example.LaptopManagement.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF for simplicity; enable in production
            .authorizeHttpRequests()
            .requestMatchers("/admin/**").hasRole("ADMIN") // Restrict /admin/ APIs to Admins
            .requestMatchers("/employee/**").hasRole("EMPLOYEE") // Restrict /employee/ APIs to Employees
            .anyRequest().authenticated() // All other requests require authentication
            .and()
            .httpBasic(); // Enable basic authentication
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Encode passwords securely
    }
}
