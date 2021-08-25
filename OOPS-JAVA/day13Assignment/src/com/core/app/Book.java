package com.core.app;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Book implements Comparable<Book> {
	private int issueBookNo;
	private String name;
	private String author;
	private double price;
	private BookCategory category;
	private int quantity;
	private Date publishDate;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	
	public Book(int issueBookNo, String name, String author, Double price, BookCategory category, int quantity, Date publishDate) {
		this.issueBookNo = issueBookNo;
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.publishDate = publishDate;
	}
	
	public Book(int issueBookNo) {
		this.issueBookNo = issueBookNo;
	}
	
	@Override
	public String toString() {
		return "Book Issue Number="+issueBookNo+", Name="+name+", Author="+author+", Price="+price+
				", Category="+category+", Quantity="+quantity+", Publish Date="+sdf.format(publishDate);
	}
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in Book equals");
		if(o instanceof Book)
			return this.issueBookNo==((Book)o).issueBookNo;
		return false;
	}

	@Override
	// b1.compareTo(b2)
	// -1 0 1
	public int compareTo(Book o) {
		System.out.println("in compareTo");
		//sorting criteria : book issue numb
		if(this.issueBookNo < o.getIssueBookNo())
			return -1;
		if(this.issueBookNo == o.getIssueBookNo())
			return 0;
		return 1;	
	}

	public int getIssueBookNo() {
		return issueBookNo;
	}

	public void setIssueBookNo(int issueBookNo) {
		this.issueBookNo = issueBookNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	
	
}


