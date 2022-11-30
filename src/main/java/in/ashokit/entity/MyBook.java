package in.ashokit.entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="My_Book")
public class MyBook 
{
	private String bookName;
	
	@EmbeddedId
	private MyBook_PK myBook_Pk;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public MyBook_PK getMyBook_Pk() {
		return myBook_Pk;
	}

	public void setMyBook_Pk(MyBook_PK myBook_Pk) {
		this.myBook_Pk = myBook_Pk;
	}

	@Override
	public String toString() {
		return "MyBook [bookName=" + bookName + ", myBook_Pk=" + myBook_Pk + "]";
	}
	
	


	
	
	
	
	

}
