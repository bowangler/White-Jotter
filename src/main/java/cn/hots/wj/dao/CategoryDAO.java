package cn.hots.wj.dao;

import cn.hots.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by TIT on 2020/7/20.
 */
@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
