package br.com.aprendizesfilmes;

import br.com.aprendizesfilmes.pojo.Filmes;
import br.com.aprendizesfilmes.pojo.Pessoa;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// Filmes
		Filmes duna = new Filmes();
		duna.setId(1);
		duna.setTitulo("Duna");
		duna.setDiretor("Denis Vileneve");
		duna.setDuracao("2H,28");
		duna.setData_lancamento("21/10/2021");
		duna.setStreaming("HBOMAX");

		Filmes jogosvorazes = new Filmes();
		jogosvorazes.setId(2);
		jogosvorazes.setTitulo("Jogos Vorazes");
		jogosvorazes.setDiretor("Gary Ross");
		jogosvorazes.setDuracao("2H,22");
		jogosvorazes.setData_lancamento("22/03/2012");
		jogosvorazes.setStreaming("Netflix e Amazon Prime");

		Gson gson = new Gson();

		//Pessoas

		Pessoa stiverson = new Pessoa();
		stiverson.setNomePessoa("Stive");
		stiverson.setIdade(34);
		stiverson.setCinefolo(true);
		stiverson.setGamer(true);
		stiverson.getListasFilmes().add(duna);
		String jsonStive = gson.toJson(stiverson);
		System.out.println(jsonStive);

		Pessoa gabi = new Pessoa();
		gabi.setNomePessoa("Gabriela");
		gabi.setIdade(17);
		gabi.setCinefolo(true);
		gabi.setGamer(false);
		gabi.getListasFilmes().add(jogosvorazes);
		String jsonGabi = gson.toJson(gabi);
		System.out.println(jsonGabi);

		//SpringApplication.run(Application.class, args);
	}

}
