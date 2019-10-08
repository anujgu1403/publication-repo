package com.java.publication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.publication.domain.Author;
import com.java.publication.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@PostMapping("/add")
	public ResponseEntity<?> addAuthor(@RequestBody Author author) {
		Author authorSaved = authorService.addAuthor(author);
		return new ResponseEntity<Author>(authorSaved, HttpStatus.CREATED);
	}
}
