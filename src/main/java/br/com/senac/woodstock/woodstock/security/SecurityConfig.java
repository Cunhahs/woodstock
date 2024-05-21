package br.com.senac.woodstock.woodstock.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authz -> authz
                        .dispatcherTypeMatchers(HttpMethod.valueOf("/login")).permitAll()
//                        .dispatcherTypeMatchers(HttpMethod.valueOf("/home")).authenticated() // Requer autenticação para acessar a página inicial
                        .anyRequest().authenticated())
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/home", true) // Redireciona para /home após o login bem-sucedido
                        .permitAll())
                .logout(logout -> logout
                        .permitAll());

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var userDetailsService = new InMemoryUserDetailsManager();
        var user = withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
        userDetailsService.createUser(user);
        return userDetailsService;
    }
}

