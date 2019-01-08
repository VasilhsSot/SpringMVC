package cb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cb.beans.Book;

@Controller
public class AddBookController {
		
	
	@RequestMapping("/showBookForm.htm")
	public ModelAndView showBookForm(ModelMap map) throws Exception {

		Book book = new Book();
		map.addAttribute(book);
		return new ModelAndView("bookForm");
	}
	
	@RequestMapping("/addBook.htm")
	public ModelAndView addBook(@ModelAttribute("book") Book book) 
						throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display");
		//later on the list will be fetched from the table
		List<Book>books = new ArrayList<Book>();
		books.add(book);
		modelAndView.addObject("book_list", books);
		modelAndView.addObject("author_name", book.getAuthor());
		return modelAndView;
	}
	
	@ModelAttribute("size")
	public List<String> addPrices() {

		List<String> sizes=new ArrayList<String>();
		sizes.add("5x8");
		sizes.add("5,5x8,5");
		sizes.add("6x9");

		return sizes;
	}
}
