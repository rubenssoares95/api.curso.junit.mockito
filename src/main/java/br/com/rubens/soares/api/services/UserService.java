package br.com.rubens.soares.api.services;

import br.com.rubens.soares.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
