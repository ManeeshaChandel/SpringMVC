package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.UserDao;
import springmvc.model.User;
@Service  //for object creation //just like @component
public class UserService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
