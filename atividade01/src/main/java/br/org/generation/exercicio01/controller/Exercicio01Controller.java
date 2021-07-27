package br.org.generation.exercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class Exercicio01Controller {

	@GetMapping
	public String exercicio1() {
		return "Olá! Para essa semana, priorizarei a mentalidade de persistência, atenção ao detalhe e"
				+ " de crescimento, pois aprenderemos um assunto novo nos próximos dias.";
	}
}