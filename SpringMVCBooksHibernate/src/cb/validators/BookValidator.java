package cb.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cb.beans.Book;

public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> book_class) {
		return book_class.equals(Book.class);
	}


	@Override
	public void validate(Object obj, Errors errors) {
		
		Book book=(Book) obj;
		if (book.getBookName().length() < 5) {
			errors.rejectValue("bookName", "bookName.required",
					"Please Enter the book Name");
		}

		if (book.getAuthor().length() <= 0) {
			errors.rejectValue("author", "authorName.required",
					"Please Enter Author's Name");
		}

		if (book.getDescription().length() <= 0)
		{
			errors.rejectValue("description", "description.required",
					"Please enter book description");
		}
		else if (book.getDescription().length() < 10 || 
						book.getDescription().length() >  40) {
			errors.rejectValue("description", "description.length",
					"Description should be within 10-40 charaters range");
		}
		
		if (book.getISBN() <= 150l) {
			errors.rejectValue("ISBN", "ISBN.required",
					"Please Enter Correct ISBN number");
		}
		
		if (book.getPrice() <= 0 ) {
			errors.rejectValue("price", "price.incorrect",	
					"Please enter a correct price");
		}

		if (book.getPublication().length() <= 0) {
			errors.rejectValue("publication", "publication.required",
					"Please enter publication ");

		}
	}
}
