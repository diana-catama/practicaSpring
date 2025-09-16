package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Comment;

import java.util.List;
import java.util.Optional;

public interface IcommentService {
    List<Comment> obtenerComentario();
    Optional<Comment> obtenerComentarioPorId(Long idComment);
    void guardarComentario(Comment comment);
    void editarComentario(Long idComment, Comment commentActualizado);
    void eliminarComentario(Long idComment);
}
