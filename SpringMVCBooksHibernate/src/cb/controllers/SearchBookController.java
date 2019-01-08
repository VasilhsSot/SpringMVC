package cb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cb.beans.Book;
import cb.dao.BookDAOHibernate;


@Controller
public class SearchBookController {
		
	@Autowired
	private BookDAOHibernate bookDao;
	
	@GetMapping(value = "searchBooks.htm")
	public ModelAndView searchBookByAuthor(@RequestParam("author") String author_name) {
		
		List<Book> books = bookDao.searchBooksByAuthor(author_name);
		
		return new ModelAndView("display", "book_list", books).addObject(
				"author_name", author_name);
	}
	
}
