package com.sistemablog.Sistema.basico.de.Blog.controller;

import com.sistemablog.Sistema.basico.de.Blog.model.Author;
import com.sistemablog.Sistema.basico.de.Blog.model.Posteo;
import com.sistemablog.Sistema.basico.de.Blog.service.IauthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/autores")
public class AuthorController {
    private IauthorService iauthorService;

    public AuthorController(IauthorService iauthorService){
        this.iauthorService = iauthorService;
    }
    @GetMapping
    public List<Author> authorList(){
        return iauthorService.obtenerAutores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> obtenerAutoresPorId(@PathVariable Long idAuthor){
        return iauthorService.obtenerAutoresPorId(idAuthor).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crearAutor")
    public ResponseEntity<String> guardarAutor(@RequestBody Author author){
        iauthorService.guardarAutor(author);
        return ResponseEntity.ok("el autor fue agregado con exito");
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarAutor(@PathVariable Long idAuthor, @RequestBody Author authorActualizado) {
        iauthorService.editarAutor(idAuthor, authorActualizado);
        return ResponseEntity.ok("El autor fue actualizado con éxito");
    }

    @DeleteMapping("/eliminarAutor/{id}")
    public ResponseEntity<String> eliminarAutor(@PathVariable Long idAuthor){
        iauthorService.eliminarAutor(idAuthor);
        return ResponseEntity.ok("el autor fue eliminado con exito");
    }
}
