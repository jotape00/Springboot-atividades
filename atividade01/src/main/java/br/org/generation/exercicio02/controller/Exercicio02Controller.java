package br.org.generation.exercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")
public class Exercicio02Controller {

	@GetMapping
	public String exercicio2() {
		return "Para essa semana do curso, meu objetivo é focar ao máximo no aprendizado de Stringboot "
				+ "e nas demais outras ferramentas, já que é um conteúdo novo.";
	}
}