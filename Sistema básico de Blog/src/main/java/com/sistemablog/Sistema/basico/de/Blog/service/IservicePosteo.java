package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;

import java.util.List;

public interface IservicePosteo {
    List<Posteo> obtenerTodos();
    Posteo obtenerPorId(Long id);
    void guardarPosteo (Posteo posteo);
}
