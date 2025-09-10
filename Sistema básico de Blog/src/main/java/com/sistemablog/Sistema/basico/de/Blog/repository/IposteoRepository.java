package com.sistemablog.Sistema.basico.de.Blog.repository;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IposteoRepository {
    List<Posteo>findAll();
    Posteo findById(Long id);
    void save (Posteo posteo);
}
