package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> index();

    void save(User user);

    Optional<User> show(int id);

    void update(User updatedUser);

    void delete(int id);
}
