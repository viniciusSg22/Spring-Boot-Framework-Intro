package com.viniciussanches.bookstoremanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciussanches.bookstoremanager.dto.MessageResponseDTO;
import com.viniciussanches.bookstoremanager.entity.Book;
import com.viniciussanches.bookstoremanager.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	private BookRepository bookRepository;

	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
				.message("Book Created with Id " + savedBook.getId())
				.build();
	}
}
