package com.dnai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy; 
<<<<<<< HEAD
import static org.springframework.security.config.Customizer.withDefaults;
=======
>>>>>>> ee9185323096aaac8424b2e6ae580fc08f686a77

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
<<<<<<< HEAD

                .requestMatchers("/api/doctors/**").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults())
=======
                .anyRequest().permitAll()
            )

            [cite_start]
>>>>>>> ee9185323096aaac8424b2e6ae580fc08f686a77
            .sessionManagement(sess -> sess
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            );

        return http.build();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> ee9185323096aaac8424b2e6ae580fc08f686a77
