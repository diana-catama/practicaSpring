package com.sistemablog.Sistema.basico.de.Blog.repository;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IposteoRepository extends JpaRepository<Posteo, Long> {
//    List<Posteo>findAll();
//    Posteo findById(Long id);
//    void save (Posteo posteo);
}
