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
public class Pessoa {
    private int x,y,cor;
    private String whatsappID;
    private ArrayList <Pessoa> AgendaContatos = new ArrayList<Pessoa>();
    //private static int novoWhats = 0;
    
    //public Pessoa(int x, int y, int cor) {
        //this.x = x;
        //this.y = y;
        //this.cor = cor;
        //this.whatsappID = "WhatsappID" + novoWhats;
        //novoWhats++;
    //}
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getCor() {
        return cor;
    }
    
    public void setCor(int cor) {
        this.cor = cor;
    }
    public String getWhatsappID() {
        return whatsappID;
    }
    public void setWhatsappID(String whatsappID) {
        this.whatsappID = whatsappID;
    }
    public ArrayList<Pessoa> getAgendaContatos() {
        return AgendaContatos;
    }
    public void setAgendaContatos(ArrayList<Pessoa> agendaContatos) {
        AgendaContatos = agendaContatos;
    }

    public void addContatos(Pessoa contato){ //Valor fixo de 100 contatos
        for (int i = 0; i < 100; i++) {
            AgendaContatos.add(contato);
        }
    }
}