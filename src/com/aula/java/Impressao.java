package com.aula.java;

public class Impressao {

	public static void main(String[] args) {
		String nome;
		String endereco;
		int idade;
		String estado;
		String email;
		
		
		nome ="Idelvan";
		endereco = "Rua Primeiro de agosto";
		idade = 22;
		estado = "Maranhão";
		email = "email@gmail.com";
		
		
		
		System.out.println(
	    "Meu nome : "+ nome+ "\n" + 
		"Meu endereco: "+ endereco + "\n"+ 
		"Minha idade: "+ idade);
		
		System.out.printf(
				"Meu Estado: "+ estado + "\n" +
				"Meu e-mail: "+ email
		 
		);

	}

}
