/*
package br.com.senac.woodstock.woodstock.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import br.com.senac.woodstock.woodstock.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class LoginFilter implements Filter {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        System.out.println("teste");

        // Verifica se a requisição é para o endpoint de login
        if (httpRequest.getRequestURI().equals(httpRequest.getContextPath() + "/login")) {
            // Se for o endpoint de login, permite que a requisição prossiga
            chain.doFilter(request, response);
            return;
        }

        // Obtém o nome de usuário da sessão
        String username = (String) httpRequest.getSession().getAttribute("user");

        if (username == null || !userRepository.findByUsername(username).isPresent()) {
            // Usuário não está logado ou não existe, redireciona para a página de login
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
        } else {
            // Usuário está logado, prossegue com a requisição
            chain.doFilter(request, response);
        }

    }

*/
/*    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialização do filtro, se necessário
    }*//*


    @Override
    public void destroy() {
        // Limpeza de recursos, se necessário
    }
}
*/
