package br.com.senac.woodstock.woodstock.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/login", "/login/**", "/cadastro", "/static/**").permitAll() // Permitir acesso público
                        .requestMatchers("/h2-console/**").permitAll() // Permitir acesso público ao H2 Console
                        .anyRequest().authenticated())
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/custom_login")
                        .defaultSuccessUrl("/home", true)
                        .permitAll())
                .logout(logout -> logout
                        .permitAll())
                .csrf(csrf -> csrf
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // Configurar um repositório de token CSRF personalizado
                        .ignoringRequestMatchers("/h2-console/**")); // Ignorar CSRF para a URL do console H2

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailsService = new InMemoryUserDetailsManager();
        var user = withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
        userDetailsService.createUser(user);
        return userDetailsService;
    }
}
