package br.com.rubens.soares.api.services.impl;

import br.com.rubens.soares.api.domain.User;
import br.com.rubens.soares.api.domain.dto.UserDto;
import br.com.rubens.soares.api.repositories.UserRepository;
import br.com.rubens.soares.api.services.UserService;
import br.com.rubens.soares.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDto obj) {
        return userRepository.save(mapper.map(obj, User.class));
    }
}
