package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> att = new HashSet<>();

    public Participante() {

    }

    public Participante(int id, String name, String email, Set<Atividade> att) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.att = att;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<Atividade> getAtt() {
        return att;
    }

    public void setAtt(Set<Atividade> att) {
        this.att = att;
    }
}
