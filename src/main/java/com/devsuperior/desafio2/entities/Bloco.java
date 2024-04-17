package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant comeco;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;


    @ManyToOne
    @JoinColumn(name = "bloco_id")
    private Atividade blocoatt;

    public Bloco(){

    }

    public Bloco(int id, Instant comeco, Instant fim, Atividade blocoatt) {
        this.id = id;
        this.comeco = comeco;
        this.fim = fim;
        this.blocoatt = blocoatt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getComeco() {
        return comeco;
    }

    public void setComeco(Instant comeco) {
        this.comeco = comeco;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Atividade getBlocoatt() {
        return blocoatt;
    }

    public void setBlocoatt(Atividade blocoatt) {
        this.blocoatt = blocoatt;
    }
}
