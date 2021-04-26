package com.wolken.wolkenapp.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.BookDTO;

public class LibraryDAOImpl implements LibraryDAO {

	public List<BookDTO> books = new LinkedList<BookDTO>();

	@Override
	public void save(BookDTO dto) {
		// TODO Auto-generated method stub
		books.add(dto);
	}

	@Override
	public List<BookDTO> getAllBooks() {
		// TODO Auto-generated method stub
		 Iterator<BookDTO> itr = books.iterator(); 
		  while(itr.hasNext()) {   // used to print all elements 
		 Object object = itr.next(); 
		  System.out.println(object);
		  }
		return null;
	}
	}
	

