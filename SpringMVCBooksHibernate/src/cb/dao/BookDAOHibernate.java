package cb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cb.beans.Book;

@Repository(value = "bookDAO")
public class BookDAOHibernate  {

	@Autowired
	SessionFactory sessionFactory;

	public boolean addBook(Book book) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean success = true;
		try {
			session.saveOrUpdate(book);
			transaction.commit();
			session.close();
		} catch (DataAccessException exception) {
			exception.printStackTrace();
			success = false;
		}
		return success;
	}


	@SuppressWarnings("unchecked")
	public List<Book> searchBooksByAuthor(String author) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<Book> query = session.createQuery(
				"from cb.beans.Book where author like :author");
		query.setParameter("author", author + "%");
		List<Book> list = query.list();
			
		try {
			list = query.list();
			transaction.commit();
			session.close();
		} catch (DataAccessException exception) {
			exception.printStackTrace();			
		}
		return list;
	}
	
	
	public boolean deleteBook(long ISBN) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean success = true;
		try {
			Book book = session.get(Book.class, ISBN);
			session.delete(book);
			transaction.commit();
			session.close();
		} catch (DataAccessException exception) {
			exception.printStackTrace();
			success = false;
		}
		return success;
	}
}
