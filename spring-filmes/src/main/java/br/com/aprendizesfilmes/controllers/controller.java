package br.com.aprendizesfilmes.controllers;

import br.com.aprendizesfilmes.domain.provedor.FilmesProvedor;
import br.com.aprendizesfilmes.domain.response.FilmesResponse;
import br.com.aprendizesfilmes.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Stiverson
 *
 */
@RestController
@RequestMapping("/api/aprendizes")
public class controller {

    @Autowired
    private FilmesService filmesService;

    @GetMapping("/pessoa")
    public ResponseEntity<String> getFilmes(@RequestParam(name = "nome_pessoa") String nomePessoa) {
        return ResponseEntity.ok("Nome da pessoa -> " + nomePessoa);
    }

    @GetMapping("/filmes")
    public ResponseEntity<FilmesResponse> getInfo(){
       return ResponseEntity.ok(filmesService.getInfo());
    }

}