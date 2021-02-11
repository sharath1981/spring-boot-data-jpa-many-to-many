package com.datajpa.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.manytomany.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
