package br.com.aprendizesfilmes.domain.response;

import br.com.aprendizesfilmes.domain.provedor.FilmesProvedor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class FilmesResponse {
    private List<FilmesProvedor> data;
}
