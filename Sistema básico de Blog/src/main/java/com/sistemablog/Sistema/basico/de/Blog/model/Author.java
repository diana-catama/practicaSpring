package com.sistemablog.Sistema.basico.de.Blog.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_author;
    private String name;
    private String email;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Posteo> posteos = new ArrayList<>();

    public Author() {
    }

    public Author(Long id_author, String name, String email) {
        this.id_author = id_author;
        this.name = name;
        this.email = email;
    }

    public Long getId_author() {
        return id_author;
    }

    public void setId_author(Long id_author) {
        this.id_author = id_author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Posteo> getPosteos() {
        return posteos;
    }

    public void setPosteos(List<Posteo> posteos) {
        this.posteos = posteos;
    }
}
