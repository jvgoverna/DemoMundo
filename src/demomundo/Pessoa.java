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
    private int coord_anterior_X, coord_anterior_y;
    //private static int novoWhats = 0;
    public int getCoord_anterior_X() {
        return coord_anterior_X;
    }

    public void setCoord_anterior_X(int coord_anterior_X) {
        this.coord_anterior_X = coord_anterior_X;
    }

    public int getCoord_anterior_y(){
        return coord_anterior_y;
    }

    public void setCoord_anterior_y(int coord_anterior_y) {
        this.coord_anterior_y = coord_anterior_y;
    }

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