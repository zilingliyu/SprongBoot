package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book,Long>{

	List<Book> findByReader(String reader);
}
