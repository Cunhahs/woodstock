package br.com.senac.woodstock.woodstock.service;

import br.com.senac.woodstock.woodstock.Model.User;
import br.com.senac.woodstock.woodstock.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        System.out.println("User service 1");

        return userRepository.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        System.out.println("User service 2");
        System.out.println(username);
        System.out.println(password);

        Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
        if (user.isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}