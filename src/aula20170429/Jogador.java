/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20170429;

/**
 *
 * @author maratona
 */
public class Jogador {
    private String nome;
    private float peso;
    private int idade;
    
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAltura( float altura) {
    	this.altura = altura;
    }	
    
    public float getAltura( ) {
    	return altura;
    }
    
}
