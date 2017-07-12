package mybatis.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mybatis.demo.dao.BookDao;
import mybatis.demo.entity.Book;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;
	
	public Book getById(long id) {
		return bookDao.queryById(id);
	}

	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}

}
