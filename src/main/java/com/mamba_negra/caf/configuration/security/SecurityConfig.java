package com.mamba_negra.caf.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->
                auth.requestMatchers("/api/v1/self-management/inscription").authenticated()
                        .requestMatchers("/api/v1/users/**").authenticated()
                        .anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    InMemoryUserDetailsManager userDetailsManager() {
        UserDetails admin = User.withUsername("admin")
                                .password("to_be_encoded")
                                .roles("ADMIN")
                                .build();

        UserDetails user = User.withUsername("user")
                                .password("to_be_encoded")
                                .roles("USER")
                                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        //TODO: replace deprecated NoOpPasswordEncoder, this is just for development in local
        return NoOpPasswordEncoder.getInstance();
    }
}
