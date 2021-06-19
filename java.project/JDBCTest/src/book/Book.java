package book;

public class Book {
	// DB에 사용자에게 입력받은 book 명단을 추가하는 프로그램 

private int bookid; // 책 번호
private String bookname; // 책 이름
private String publisher; // 출판사
private int price; // 책 가격


public Book(int bookid, String bookname, String publisher, int price) {
this.bookid = bookid;
this.bookname = bookname;
this.publisher = publisher;
this.price = price;
	}


public int getBookid() {
	return bookid;
}


public void setBookid(int bookid) {
	this.bookid = bookid;
}


public String getBookname() {
	return bookname;
}


public void setBookname(String bookname) {
	this.bookname = bookname;
}


public String getPublisher() {
	return publisher;
}


public void setPublisher(String publisher) {
	this.publisher = publisher;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", publisher=" + publisher + ", price=" + price + "]";
}



}
