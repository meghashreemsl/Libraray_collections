package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dao.LibraryDAO;
import com.wolken.wolkenapp.dao.LibraryDAOImpl;

public class LibraryUtil {
	public static void main(String[] args) {
		LibraryDAO booksdao1 = new LibraryDAOImpl();//abstraction
		BookDTO books = new BookDTO("yana","dk",2,3,"rtkumar]"
				+ "tggtgtg",322,"geeta");
		booksdao1.save(books);
		booksdao1.getAllBooks();
		
		/*
		 * BookDTO books = new BookDTO("yana","dk",2,3,"rt",322,"gh"); LibraryDAOImpl
		 * booksdao = new LibraryDAOImpl(); booksdao.save(books);
		 * booksdao.getAllBooks();
		 */
		
	}

}
