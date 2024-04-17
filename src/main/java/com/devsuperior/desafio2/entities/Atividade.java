package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;
import jakarta.servlet.http.Part;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


    @ManyToMany(mappedBy = "att")
    private Set<Participante> atividades = new HashSet<>();


    @OneToMany(mappedBy = "blocoatt")
    private List<Bloco> blocos = new ArrayList<>();

    public Atividade(){

    }

    public Atividade(int id, String name, String description, Double valor, Categoria categoria, Set<Participante> atividades, List<Bloco> blocos) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.valor = valor;
        this.categoria = categoria;
        this.atividades = atividades;
        this.blocos = blocos;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Participante> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Participante> atividades) {
        this.atividades = atividades;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Bloco> blocos) {
        this.blocos = blocos;
    }
}
