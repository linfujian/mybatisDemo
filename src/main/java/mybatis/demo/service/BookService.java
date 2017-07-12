package mybatis.demo.service;

import java.util.List;

import mybatis.demo.entity.Book;

public interface BookService {

	Book getById(long id);
	
	List<Book> getList();
}
