package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;

import java.util.List;
import java.util.Optional;

public interface IservicePosteo {
    List<Posteo> obtenerTodos();
    Optional<Posteo> obtenerPorId(Long id);
    void guardarPosteo(Posteo posteo);
    void editarPosteo(Long id, Posteo posteo);
    void eliminarPosteo(Long id);
//    void asignarComentario(Long idPosteo, Long idComment);
}
