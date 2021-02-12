package com.datajpa.manytomany.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.manytomany.domain.Author;
import com.datajpa.manytomany.repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("api/v1/authors")
@RestController
public class AuthorController {

	private final AuthorRepository authorRepository;
	
	@GetMapping
	public List<Author> list() {
		return authorRepository.findAll();
	}
	
	@PostMapping
	public Author save(@RequestBody Author author) {
		return authorRepository.save(author);
	}
}
