package com.java.publication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.publication.domain.Author;
import com.java.publication.respository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	@Override
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

}
