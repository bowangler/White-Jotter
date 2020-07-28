package cn.hots.wj.dao;

import cn.hots.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by TIT on 2020/7/20.
 */
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);

}
