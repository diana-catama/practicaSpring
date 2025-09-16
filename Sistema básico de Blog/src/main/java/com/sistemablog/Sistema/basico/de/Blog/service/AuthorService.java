package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Author;
import com.sistemablog.Sistema.basico.de.Blog.model.Comment;
import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.repository.IauthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IauthorService{

    private final IauthorRepository iauthorRepository;

    @Autowired
    public AuthorService(IauthorRepository iauthorRepository){
        this.iauthorRepository = iauthorRepository;
    }
    @Override
    public List<Author> obtenerAutores() {
        return iauthorRepository.findAll();
    }

    @Override
    public Optional<Author> obtenerAutoresPorId(Long idAuthor) {
        return iauthorRepository.findById(idAuthor);
    }

    @Override
    public void guardarAutor(Author author) {
        iauthorRepository.save(author);
    }

    @Override
    public void editarAutor(Long idAuthor, Author authorActualizado){
        authorActualizado.setId_author(idAuthor);
        iauthorRepository.save(authorActualizado);
    }

    @Override
    public void eliminarAutor(Long idAuthor){
        iauthorRepository.deleteById(idAuthor);
    }
}
