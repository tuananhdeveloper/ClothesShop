//package com.tuananh.clothes_shop.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@Configuration
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers(HttpMethod.GET,"/products").permitAll()
//                .antMatchers(HttpMethod.POST,"/users/register").permitAll()
//                .antMatchers(HttpMethod.POST,"/users/login").permitAll()
//                .anyRequest().authenticated();
//    }
//}