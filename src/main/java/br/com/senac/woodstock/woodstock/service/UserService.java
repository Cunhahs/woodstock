package br.com.senac.woodstock.woodstock.service;

import java.util.List;

import br.com.senac.woodstock.woodstock.Model.User;

public interface UserService {

    User createUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(User user);
}