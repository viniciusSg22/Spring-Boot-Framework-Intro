package com.viniciussanches.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussanches.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
