package br.com.aprendizesfilmes.controllers;

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

    @GetMapping("/filmes")
    public ResponseEntity<String> getFilmes(@RequestParam(name = "nome_pessoa") String nomePessoa) {
        return ResponseEntity.ok("Nome da pessoa -> " + nomePessoa);
    }

}