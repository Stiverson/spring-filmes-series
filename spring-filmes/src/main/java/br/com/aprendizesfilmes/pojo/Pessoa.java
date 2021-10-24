package br.com.aprendizesfilmes.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nomePessoa;
    private int idade;
    private boolean cinefolo;
    private boolean gamer;
    private List<Filmes> listasFilmes = new ArrayList<Filmes>();

    public List<Filmes> getListasFilmes() {
        return listasFilmes;
    }

    public void setListasFilmes(List<Filmes> listasFilmes) {
        this.listasFilmes = listasFilmes;
    }

    public List<Series> getListasSeries() {
        return listasSeries;
    }

    public void setListasSeries(List<Series> listasSeries) {
        this.listasSeries = listasSeries;
    }

    private List<Series> listasSeries = new ArrayList<Series>();

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCinefolo() {
        return cinefolo;
    }

    public void setCinefolo(boolean cinefolo) {
        this.cinefolo = cinefolo;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }
}
