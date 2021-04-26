package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.BookDTO;

public interface LibraryDAO {
	public void save(BookDTO dto) ;
	public List<BookDTO>getAllBooks();
}
