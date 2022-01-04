package br.com.rubens.soares.api.services;

import br.com.rubens.soares.api.domain.User;
import br.com.rubens.soares.api.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDto obj);
}
