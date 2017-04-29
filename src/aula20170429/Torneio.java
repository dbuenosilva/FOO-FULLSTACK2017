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
public class Torneio {
	
	private static int QTD_LIMITE_TIME = 25;
	private static int QTD_CLASSIFICACAO = 10;
	
    private Time[] times = new Time[QTD_LIMITE_TIME];
    private int quantidadeTimes = 0;
    private Time[] classificacao = new Time[QTD_CLASSIFICACAO];
    
    public void incluirTime(Time novoTime){
        if(quantidadeTimes < times.length){
            times[quantidadeTimes] = novoTime;
            quantidadeTimes++;
        }else{
            System.out.println("\nNão pode ser incluido mais times!");
        }
    }
    
    public int quantidadeTime(){
        return quantidadeTimes;
    }
    
    public float calcularPesoMedioParticipantes(){
        float pesoMedioParticipantes = 0;
        Time time;
        
        for (int i = 0; i < quantidadeTimes; i++){
            time = times[i];
            pesoMedioParticipantes = pesoMedioParticipantes + time.calcularPesoMedioTime();
        }
        pesoMedioParticipantes = pesoMedioParticipantes/quantidadeTimes;
                
        return pesoMedioParticipantes;
    }
    
    public float calcularIdadeMediaParticipantes(){
        float idadeMediaParticipantes = 0;
        Time time;
        
        for (int i = 0; i < quantidadeTimes; i++){
            time = times[i];
            idadeMediaParticipantes = idadeMediaParticipantes + time.calcularIdadeMedioTime();
        }
        idadeMediaParticipantes = idadeMediaParticipantes/quantidadeTimes;
                
        return idadeMediaParticipantes;
    }
    
    
    public Time[] getClassificacao(){
       return(this.classificacao);
    }
 
    public void setClassificacao( Time[] classificacao ) {    	
    	this.classificacao = classificacao;
    }
    
}
