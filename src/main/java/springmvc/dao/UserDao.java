package springmvc.dao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import springmvc.model.User;
@Repository  //just like @component for autowiring(injecting object)
public class UserDao {
    @Autowired //for object creation automatically once by spring container
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int saveUser(User user){
        int id=(Integer) this.hibernateTemplate.save(user);  //saving in db
        return id;
    }
}
