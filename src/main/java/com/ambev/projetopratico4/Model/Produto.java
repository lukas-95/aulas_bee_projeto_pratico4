package com.ambev.projetopratico4.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {
    private String id;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", preco=" + preco +
            '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
