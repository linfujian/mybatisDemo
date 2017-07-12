package mybatis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import mybatis.demo.entity.Book;
import mybatis.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/{id}")
	public String getById(@PathVariable("id") long id, Model model) {
		Book book = bookService.getById(id);
		model.addAttribute("book", book);
		return "book";
	}
	
	@RequestMapping("/all")
	public String getAll(Model model) {
		List<Book> list = bookService.getList();
		model.addAttribute("list", list);
		return "list";
	}

}
