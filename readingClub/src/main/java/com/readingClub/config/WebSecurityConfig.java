package com.readingClub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.readingClub.service.CustomUserService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
    UserDetailsService customUserService() {
        return new CustomUserService();
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder());
    }
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        		.anyRequest().authenticated()
        		.antMatchers("/css/**", "/js/**","/img/**").permitAll()
                .and().formLogin().loginPage("/login")//设置登录页面
                /*.defaultSuccessUrl("/")//设置默认登录成功跳转页面*/
                .failureUrl("/login?error").permitAll()
                .and()
                .logout().permitAll();
    }
    
}
