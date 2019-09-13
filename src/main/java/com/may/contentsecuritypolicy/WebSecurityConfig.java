package com.may.contentsecuritypolicy;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .httpBasic().disable()
            .headers()
            .frameOptions().disable()
            .contentSecurityPolicy("default-src 'self' http://localhost ;"); // report-uri /csp-report-endpoint/
    }

}