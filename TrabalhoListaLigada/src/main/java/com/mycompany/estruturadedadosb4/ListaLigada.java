package com.mycompany.estruturadedadosb4;

public class ListaLigada<T> {

    private No<T> primeiro;
    private int tamanho;

    public ListaLigada() {
        primeiro = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaInicio(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null, null);
        primeiro = novoNo;
        tamanho++;
    }

    public void adicionaFinal(T conteudo) {
        No<T> ultimoN = this.acharUltimoElemento();
        No<T> novoNo = new No<T>(conteudo, null, ultimoN);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void mostraNos() {
        if (tamanho != 0) {
            No<T> atual = primeiro;
            int contador = 0;
            //atual = atual.getProximo();
            while (atual.getProximo() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }
    
    private No<T> acharUltimoElemento(){
        
        No<T> ultimo = primeiro;
       
        
        while (ultimo.getProximo() != null) {
             
                ultimo = ultimo.getProximo();
            }
            
       return ultimo;
        
    }
    
    
    public void crescente(){
        No<T> proximo = this.primeiro;
        int contador = 0;
        System.out.println("Na " + contador + " o valor é: " + proximo.getConteudo());
        contador++;
        while (proximo.getProximo() != null) {
             proximo = proximo.getProximo();
             System.out.println("Na " + contador + " o valor é: " + proximo.getConteudo());
             contador++;
            }
    }
    public void decrescente(){
        No<T> ultimo = this.acharUltimoElemento();
        int contador = 0;
        System.out.println("Na " + contador + " o valor é: " + ultimo.getConteudo());
        contador++;
        while (ultimo.getAnterior() != null) {
             ultimo = ultimo.getAnterior();
             System.out.println("Na " + contador + " o valor é: " + ultimo.getConteudo());
             contador++;
            }
    }

}