/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;

import java.util.ArrayList;

/**
 *
 * @author João Vitor
 */
public class FakeNews { //Classe responsavel por contar quantas pessoas entraram na ia geradora de fake news
    
    private ArrayList <Integer> pessoaNaGeradoraFake = new ArrayList<>(); //Coloco num arraylist de inteiros
    private int contador;
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void AdicionarPessoaInfectada(Pessoa p){ 
        if(!pessoaNaGeradoraFake.contains(p.getID())){ //Verifica se o novo arrayList de inteiros nn contem o id da pessoa que entrou
            pessoaNaGeradoraFake.add(p.getID()); //Se nn estiver adiciona no novo arayList 
            contador = pessoaNaGeradoraFake.size(); // Contador será igual as pessoas do novo arrayList
        }
    }
    
}