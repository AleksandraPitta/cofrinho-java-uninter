package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList <Moeda> moedas = new ArrayList<>();
	//usa a lista ArrayList pra armazenar todos os tipos de moedas
	//e é privada, as outras classes não terão acesso
	public void add (Moeda m) {
		moedas.add(m);
	} 
	
	public void remove (Moeda m) {
		//aqui foi extremamente dificil,
		//a moeda só será removida se em valor inteiro
		//aí também terão opções de moedas
		for (int i = 0; i < moedas.size(); i++) {
	        Moeda atual = moedas.get(i);

	        if (atual.getClass() == m.getClass()) { // verifica o tipo
	            if (atual.getValor() == m.getValor()) { // usa getValor() para comparar
	                moedas.remove(i);
	                System.out.println("Moeda removida com sucesso!");
	                return;
	            }
	        }
	    }
	    System.out.println("Moeda não encontrada!");
	}
	
	public void listar() {//aqui vai ser onde todas as moedas aparecem
	    if (moedas.isEmpty()) {
	        System.out.println("Não há dinheiro no seu cofrinho! 💸");
	        return; //caso não haja nada
	    }

	    System.out.println("Cofrinho cheio! 😉");
	    for (Moeda m : moedas) {
	        m.info(); 
	    }
	}
		public double totalConvertido() {
		//aqui é somado o valor total das moedas convertidos em rela
			double total = 0;
			for (Moeda m : moedas){
				total += m.converter();}
			return total;
		}
		
	}

