package com.sistemablog.Sistema.basico.de.Blog.controller;
import com.sistemablog.Sistema.basico.de.Blog.model.Comment;
import com.sistemablog.Sistema.basico.de.Blog.service.IcommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class CommentController {
    private IcommentService icommentService;

    public CommentController(IcommentService icommentService){
        this.icommentService = icommentService;
    }
    @GetMapping
    public List<Comment> commentList(){
        return icommentService.obtenerComentario();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> obtenerComentarioPorId(@PathVariable Long idComment){
        return icommentService.obtenerComentarioPorId(idComment).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crearComentario")
    public ResponseEntity<String> guardarComentario(@RequestBody Comment comment){
        icommentService.guardarComentario(comment);
        return ResponseEntity.ok("el comentario fue agregado con exito");
    }

    @PutMapping("/editarComentario/{id}")
    public ResponseEntity<String> editarComentario(@PathVariable Long idComment, @RequestBody Comment commentActualizado) {
        icommentService.editarComentario(idComment, commentActualizado);
        return ResponseEntity.ok("El comentario fue actualizado con éxito");
    }

    @DeleteMapping("/eliminarAutor/{id}")
    public ResponseEntity<String> eliminarComentario(@PathVariable Long idComment){
        icommentService.eliminarComentario(idComment);
        return ResponseEntity.ok("el comentario fue eliminado con exito");
    }
}
