package br.ufrn.imd.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
	
	
	private List<ItemAcervo> itens; 
    
    public void addAcervo(ItemAcervo item) {
        if(itens == null)
           itens = new ArrayList<>();
            itens.add(item);
    
    }
    public void printAcervo(){
        System.out.println("""
                           Lista de todo o Acervo: 
                           """ + itens);
    }
    
    public List<ItemAcervo> listarItensCadastrados() {
		return itens;
	}
    
    public void imprimeCadastrados() {
    	for(ItemAcervo item : listarItensCadastrados()) {
    		System.out.println(item);
    	}
    }
    
    public void listarItensDisponiveis() {
    	System.out.println("Itens disponíveis para alugar");
    	for (ItemAcervo item : listarItensCadastrados()) {
    		if( item.isDisponivel() == true) {
    			System.out.println(item);
    		}
    	}
    }
	
	public void disponiveis() {
		
	}
	public void esclusivo() {
		
	}
	public Date prevEntrega() {
		return null;
	}
	public Endereco localizacao() {
		return null;
	}
}
