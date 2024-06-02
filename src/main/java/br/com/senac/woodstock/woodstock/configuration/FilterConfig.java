/*
package br.com.senac.woodstock.woodstock.configuration;
import br.com.senac.woodstock.woodstock.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<LoginFilter> loginFilter() {
        System.out.println("FILTER CONFIG");
        FilterRegistrationBean<LoginFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new LoginFilter());
        registrationBean.addUrlPatterns("/protected/*"); // Adicione os padrões de URL que devem ser protegidos
        return registrationBean;
    }
}
*/
