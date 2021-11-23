package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> index() {
        if (userRepository.findAll() == null) {
            return (List<User>) new User("ivan", "ivan@mail.ru", 12);
        }
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> show(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(User updatedUser) {
        userRepository.saveAndFlush(updatedUser);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
