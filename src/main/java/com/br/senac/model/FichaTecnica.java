
package com.br.senac.model;

import java.util.ArrayList;

public class FichaTecnica {
    private int id;
    private String nome;
    private String descricao;
    private ArrayList<String> processos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    public ArrayList<String> getProcessos() {
    return processos;
    }

    public void setProcessos(ArrayList<String> processos) {
        this.processos = processos;
    }
    
}
