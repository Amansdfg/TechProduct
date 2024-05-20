package com.example.demo.config;

import com.example.demo.services.imp.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Bean
    public UserServiceImp service(){
        return new UserServiceImp();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        AuthenticationManagerBuilder builder=http.getSharedObject(AuthenticationManagerBuilder.class);
        builder.userDetailsService(service()).passwordEncoder(passwordEncoder());
        http.formLogin(e->{
            e.loginPage("/techGadget/sign-in").loginProcessingUrl("/sing-in").usernameParameter("email").passwordParameter("password").defaultSuccessUrl("/techGadget/phones").failureUrl("/techGadget/sign-in?error");
        });
        http.logout(e->{
           e.logoutUrl("/techGadget/logout").logoutSuccessUrl("/techGadget/sign-in");
        });
        http.csrf(e->{
            e.disable();
        });
        return http.build();
    }
}
