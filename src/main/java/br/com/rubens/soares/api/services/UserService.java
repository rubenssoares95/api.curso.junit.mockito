package br.com.rubens.soares.api.services;

import br.com.rubens.soares.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
