package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class MyBook_PK implements Serializable
{
	private Integer bookId;
	private String bookIsbn;
	
	
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	
	

}
