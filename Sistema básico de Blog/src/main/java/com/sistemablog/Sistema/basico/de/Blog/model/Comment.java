package com.sistemablog.Sistema.basico.de.Blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comment;

    private String text;
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonBackReference
    private Posteo posteo;

    public Comment() {
    }

    public Comment(Long id_comment, String text, String createdAt) {
        this.id_comment = id_comment;
        this.text = text;
        this.createdAt = createdAt;
    }

    public Long getId_comment() {
        return id_comment;
    }

    public void setId_comment(Long id_comment) {
        this.id_comment = id_comment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Posteo getPosteo() {
        return posteo;
    }

    public void setPosteo(Posteo posteo) {
        this.posteo = posteo;
    }
}
