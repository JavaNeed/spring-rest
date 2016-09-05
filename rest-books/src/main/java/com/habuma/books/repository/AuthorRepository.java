package com.habuma.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habuma.books.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
