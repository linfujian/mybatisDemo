package mybatis.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mybatis.demo.entity.Book;

public interface BookDao {

	Book queryById(Long id);
	
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
