package br.com.aprendizesfilmes.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Pessoa {
    private String nomePessoa;
    private int idade;
    private boolean cinefolo;
    private boolean gamer;
    private List<Filmes> filmes = new ArrayList<>();
    private List<Series> series = new ArrayList<>();

}
