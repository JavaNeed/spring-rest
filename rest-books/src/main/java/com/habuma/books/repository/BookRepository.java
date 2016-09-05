package com.habuma.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habuma.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByAuthorId(long id);
}
