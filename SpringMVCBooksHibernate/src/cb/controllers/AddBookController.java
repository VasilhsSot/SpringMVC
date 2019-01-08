package cb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cb.beans.Book;
import cb.dao.BookDAOHibernate;

@Controller
public class AddBookController {

	@Autowired
	private Validator validator;
	@Autowired
	private BookDAOHibernate bookDao;
	
	@InitBinder
	private void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(validator);
	}
	
	@RequestMapping("/showBookForm.htm")
	public ModelAndView showBookForm(ModelMap map) throws Exception {

		Book book = new Book();
		map.addAttribute(book);
		return new ModelAndView("bookForm");
	}
	
	@RequestMapping("/addBook.htm")
	public ModelAndView addBook(@Valid @ModelAttribute("book") Book book, 
				BindingResult bindingResult) throws Exception {
		
		if(bindingResult.hasErrors())
			return new ModelAndView("bookForm");

		// add book
		String message;
		boolean success = bookDao.addBook(book);
		if (success)
			message = "Book has been added successfully";
		else
			message = "Could not add book";
		
		return new ModelAndView("displaymessage", "message", message);
	}
	
}
