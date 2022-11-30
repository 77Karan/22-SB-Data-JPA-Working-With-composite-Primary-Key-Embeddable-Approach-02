package in.ashokit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.MyBook;
import in.ashokit.entity.MyBook_PK;
import in.ashokit.repository.BookRepository;

@Service
public class BookService 
{
	private BookRepository repo;
	
	public BookService(BookRepository repo)
	{
		this.repo=repo;
	}
	
	public void saveBook()
	{
		MyBook_PK pk = new MyBook_PK();
		pk.setBookId(124);
		pk.setBookIsbn("isbn02");
		MyBook book = new MyBook();
		
	book.setBookName("SpringSecurity");
	book.setMyBook_Pk(pk);
		
		repo.save(book);
		
	}
	
	public void getMyBookByPK()
	{
		MyBook_PK pk = new MyBook_PK();
		pk.setBookId(123);
		pk.setBookIsbn("isbn01");
		
		Optional<MyBook> findbyId = repo.findById(pk);
		if(findbyId.isPresent())
		{
			System.out.println(findbyId.get());
		}
		
		
	}
	

}
