package com.mycompany.estruturadedadosb4;

public class Executor {
    public static void main(String[] args) {

        ListaLigada listaLigada = new ListaLigada();
        System.out.println(listaLigada.getTamanho());
        System.out.println("");
        
        //Inserindo um elemento na lista ligada
        listaLigada.adicionaInicio(10);
        listaLigada.adicionaFinal(11);
        listaLigada.adicionaFinal(12);
        listaLigada.adicionaFinal(13);
        System.out.println(listaLigada.getTamanho());
        
        
        System.out.println("");
        //Verificando elementos da minha lista ligada
        listaLigada.mostraNos();
        System.out.println("");
        
       
        System.out.println("Crescente");
        listaLigada.crescente();
        System.out.println("Decrescente");
        listaLigada.decrescente();
    }
    
    
}
