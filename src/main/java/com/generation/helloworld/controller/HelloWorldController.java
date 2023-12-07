package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping 
	public String helloWorld() {
		return "Hello World!\r\n"
				+ ""
				+ "SoftSkills desenvolvidas:\r\n"
				+ "• Mentalidade de crescimento;\r\n"
				+ "• Orientação ao futuro;\r\n"
				+ "• Persistência;\r\n"
				+ "• Responsabilidade pessoal;\r\n"
				+ "• Orientação ao detalhe;\r\n"
				+ "• Trabalho em equipe;\r\n"
				+ "• Proatividade;\r\n"
				+ "• Comunicação;\r\n"
				+ ""
				+ "Apendizagens da Semana:\r\n"
				+ "• Desenvolvendo o Projeto Integrador;\r\n"
				+ "• DDL com MySQL;\r\n"
				+ "• Introdução ao MySQl;\r\n"
				+ "• SQL Avançado;\r\n"
				+ "• Introdução ao desenvolvimento web com o uso de Java e Spring Boot;\r\n";
				
	}
		
}
