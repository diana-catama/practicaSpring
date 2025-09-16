package com.sistemablog.Sistema.basico.de.Blog.repository;

import com.sistemablog.Sistema.basico.de.Blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcommentRepository extends JpaRepository<Comment, Long>{
}
