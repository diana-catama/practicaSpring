package com.sistemablog.Sistema.basico.de.Blog.repository;

import com.sistemablog.Sistema.basico.de.Blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IauthorRepository extends JpaRepository<Author, Long> {
}
