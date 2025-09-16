package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Comment;
import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.repository.IcommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements IcommentService{

    private final IcommentRepository icommentRepository;

    @Autowired
    public CommentService(IcommentRepository icommentRepository){
        this.icommentRepository = icommentRepository;
    }
    @Override
    public List<Comment> obtenerComentario() {
        return icommentRepository.findAll();
    }

    @Override
    public Optional<Comment> obtenerComentarioPorId(Long idComment) {
        return icommentRepository.findById(idComment);
    }

    @Override
    public void guardarComentario(Comment comment) {
        icommentRepository.save(comment);
    }

    @Override
    public void editarComentario(Long idComment, Comment commentActualizado){
        commentActualizado.setId_comment(idComment);
        icommentRepository.save(commentActualizado);
    }

    @Override
    public void eliminarComentario(Long idComment){
        icommentRepository.deleteById(idComment);
    }

}
