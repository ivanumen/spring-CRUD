package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DAO;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private DAO dao;

    @Autowired
    public UserServiceImp(DAO dao) {
        this.dao = dao;
    }

    @Override
    public List<User> index() {
        return dao.index();
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public User show(int id) {
        return dao.show(id);
    }

    @Override
    public void update(User updatedUser) {
        dao.update(updatedUser);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
