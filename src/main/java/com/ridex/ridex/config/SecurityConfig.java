package com.ridex.ridex.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.ridex.ridex.security.JwtFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(
            JwtFilter jwtFilter
    ){

        this.jwtFilter = jwtFilter;

    }

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http
    ) throws Exception {

        http

                // DISABLE CSRF

                .csrf(csrf -> csrf.disable())

                // ENABLE CORS

                .cors(cors -> {})

                // STATELESS SESSION

                .sessionManagement(session ->

                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS
                        )

                )

                // AUTHORIZE REQUESTS

                .authorizeHttpRequests(auth -> auth

                        // PUBLIC HTML PAGES

                        .requestMatchers(

                                "/",

                                "/index.html",

                                "/login.html",

                                "/signup.html",

                                "/dashboard.html",

                                "/customers.html",

                                "/drivers.html",

                                "/rides.html",

                                "/myrides.html",

                                "/driver-login.html",

                                "/driver-dashboard.html",

                                "/driver-trips.html",

                                "/driver-earnings.html",

                                "/admin-dashboard.html",

                                "/admin-drivers.html",

                                "/admin-customers.html",

                                "/admin-analytics.html"

                        ).permitAll()

                        // STATIC FILES

                        .requestMatchers(

                                "/css/**",

                                "/js/**",

                                "/images/**",

                                "/favicon.ico"

                        ).permitAll()

                        // AUTH APIs

                        .requestMatchers(

                                "/auth/**"

                        ).permitAll()

                        // CUSTOMER SIGNUP API

                        .requestMatchers(

                                HttpMethod.POST,

                                "/customers"

                        ).permitAll()

                        // SECURED APIs

                        .requestMatchers(

                                "/rides/**",

                                "/drivers/**",

                                "/customers/**"

                        ).authenticated()

                        // EVERYTHING ELSE

                        .anyRequest().permitAll()

                )

                // JWT FILTER

                .addFilterBefore(

                        jwtFilter,

                        UsernamePasswordAuthenticationFilter.class

                );

        return http.build();

    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource(){

        CorsConfiguration configuration =
                new CorsConfiguration();

        // ALLOW ALL ORIGINS

        configuration.setAllowedOrigins(
                List.of("*")
        );

        // ALLOW METHODS

        configuration.setAllowedMethods(

                List.of(

                        "GET",

                        "POST",

                        "PUT",

                        "DELETE",

                        "OPTIONS"

                )

        );

        // ALLOW HEADERS

        configuration.setAllowedHeaders(
                List.of("*")
        );

        // ALLOW CREDENTIALS

        configuration.setAllowCredentials(
                false
        );

        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration(

                "/**",

                configuration

        );

        return source;

    }

}