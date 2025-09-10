package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.repository.IposteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo{

    private IposteoRepository posteoRepository;

    @Autowired
    public PosteoService(IposteoRepository posteoRepository){
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> obtenerTodos() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo obtenerPorId(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void guardarPosteo(Posteo posteo) {
        posteoRepository.save(posteo);
    }
}
