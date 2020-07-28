package cn.hots.wj.dao;

import cn.hots.wj.pojo.Book;
import cn.hots.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TIT on 2020/7/20.
 */
@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);

}
