package cb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cb.beans.Book;


@Controller
public class SearchBookController {
	@GetMapping(value = "searchBooks.htm")
	public ModelAndView searchBookByAuthor(@RequestParam("author") String author_name) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Learning Modular Java Programming", 9781235, "Packt", 
				"5x8", 60, "Explore the power of modular Programming", author_name));
		books.add(new Book("Java OCP", 9781235, "Bookie", "5x8", 40,
				"Sample tests of the original certification", author_name));
		return new ModelAndView("display", "book_list", books).addObject(
				"author_name", author_name);
	}
	
}
