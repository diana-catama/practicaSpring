package com.sistemablog.Sistema.basico.de.Blog.service;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.repository.IposteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PosteoService implements IservicePosteo{

    private IposteoRepository posteoRepository;
    private IauthorService iauthorService;
    private IcommentService icommentService;

    @Autowired
    public PosteoService(IposteoRepository posteoRepository){
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> obtenerTodos() {
        return posteoRepository.findAll();
    }

    @Override
    public Optional<Posteo> obtenerPorId(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void guardarPosteo(Posteo posteo) {
        posteoRepository.save(posteo);
    }

    @Override
    public void editarPosteo(Long id, Posteo posteo){
        Posteo existente = posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado"));

        existente.setTitulo(posteo.getTitulo());
        existente.setAuthor(posteo.getAuthor());
        posteoRepository.save(existente);
    }

    @Override
    public void eliminarPosteo(Long id){
        posteoRepository.deleteById(id);
    }
}
