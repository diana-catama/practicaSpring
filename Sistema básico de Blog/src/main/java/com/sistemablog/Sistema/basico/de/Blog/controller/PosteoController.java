package com.sistemablog.Sistema.basico.de.Blog.controller;

import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.service.PosteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {
    private PosteoService posteoService;

    @Autowired
    public PosteoController(PosteoService posteoService){
        this.posteoService = posteoService;
    }

    @GetMapping
    public List<Posteo> posteoList(){
        return posteoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Posteo> obtenerPorId(@PathVariable Long id){
        return posteoService.obtenerPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crear")
    public ResponseEntity<String> guardarPosteo(@RequestBody Posteo posteo){
        posteoService.guardarPosteo(posteo);
        return ResponseEntity.ok("el posteo fue agregado con exito");
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarPosteo(@PathVariable Long id, @RequestBody Posteo posteo) {
        posteoService.editarPosteo(id, posteo);
        return ResponseEntity.ok("El posteo fue actualizado con éxito");
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarPosteo(@PathVariable Long id){
        posteoService.eliminarPosteo(id);
        return ResponseEntity.ok("el posteo fue eliminado con exito");
    }

}
