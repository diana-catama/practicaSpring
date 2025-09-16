package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Author;
import com.sistemablog.Sistema.basico.de.Blog.model.Comment;

import java.util.List;
import java.util.Optional;

public interface IauthorService {

    List<Author> obtenerAutores();
    Optional<Author> obtenerAutoresPorId(Long idAuthor);
    void guardarAutor(Author author);
    void editarAutor(Long idAuthor, Author authorActualizado);
    void eliminarAutor(Long idAuthor);
}
