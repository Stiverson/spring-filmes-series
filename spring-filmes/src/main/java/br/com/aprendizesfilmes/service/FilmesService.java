package br.com.aprendizesfilmes.service;

import br.com.aprendizesfilmes.domain.Filmes;
import br.com.aprendizesfilmes.domain.provedor.FilmesProvedor;
import br.com.aprendizesfilmes.domain.Pessoa;
import br.com.aprendizesfilmes.domain.response.FilmesResponse;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {

    public FilmesResponse getInfo() {

        List<Filmes> filmesList = new ArrayList<>();
        List<FilmesProvedor> filmesProvedors = new ArrayList<>();
        FilmesProvedor provedor = new FilmesProvedor();
        FilmesProvedor provedor2 = new FilmesProvedor();

        // Filmes
        Filmes duna = new Filmes();
        duna.setId(1);
        duna.setTitulo("Duna");
        duna.setDiretor("Denis Vileneve");
        duna.setDuracao("2H,28");
        duna.setData_lancamento("21/10/2021");
        duna.setElenco("");
        duna.setStreaming("HBOMAX");

        Filmes spiderverse = new Filmes();
        spiderverse.setId(2);
        spiderverse.setTitulo("Homem Aranha no Aranha verso");
        spiderverse.setDiretor("");
        spiderverse.setDuracao("");
        spiderverse.setData_lancamento("");
        spiderverse.setElenco("");
        spiderverse.setStreaming("Netflix");

        filmesList.add(duna);
        filmesList.add(spiderverse);

        Filmes jogosvorazes = new Filmes();
        jogosvorazes.setId(3);
        jogosvorazes.setTitulo("Jogos Vorazes");
        jogosvorazes.setDiretor("Gary Ross");
        jogosvorazes.setDuracao("2H,22");
        jogosvorazes.setData_lancamento("22/03/2012");
        jogosvorazes.setElenco("");
        jogosvorazes.setStreaming("Netflix e Amazon Prime");

        Gson gson = new Gson();

        //Pessoas

        Pessoa stiverson = new Pessoa();
        stiverson.setNomePessoa("Stive");
        stiverson.setIdade(34);
        stiverson.setCinefolo(true);
        stiverson.setGamer(true);
        stiverson.getFilmes().add(duna);
        String jsonStive = gson.toJson(stiverson);
        System.out.println(jsonStive);

        provedor.setPessoa(stiverson);
        provedor.getPessoa().setFilmes(filmesList);
        filmesProvedors.add(provedor);
        filmesList = new ArrayList<>();


        Pessoa gabi = new Pessoa();
        gabi.setNomePessoa("Gabriela");
        gabi.setIdade(17);
        gabi.setCinefolo(true);
        gabi.setGamer(false);
        gabi.getFilmes().add(jogosvorazes);
        String jsonGabi = gson.toJson(gabi);
        filmesList.add(jogosvorazes);
        provedor2.setPessoa(gabi);
        provedor2.getPessoa().setFilmes(filmesList);
        filmesProvedors.add(provedor2);
        System.out.println(jsonGabi);

        return new FilmesResponse(filmesProvedors);
    }

}
