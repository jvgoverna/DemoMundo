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
import java.util.Random;
public abstract class Pessoa implements iMovable{
    private Random rand = new Random();

    private int x, y,velocidade = 1;

    private int cor;

    private String whatsappID;
    private int ID = 0;

    private boolean infectado = false;
    private int imune = 0;
    
    private ArrayList <Integer> AgendaContatos = new ArrayList<>();

    public void move(){
        int move = rand.nextInt(4);
        switch(move){
            case 0: //cima
                y -= getVelocidade();
                if(y < 1){
                    y = 58;
                    
                }else if(y > 58){
                    y = 1;
                    
                }
                break;
            case 1: //baixo
                    y += getVelocidade();
                    if(y < 1){
                        y = 58;
                        
                    }else if(y > 58){
                        y = 1;
                        
                    }
                break;
            case 2: //direita
                x += getVelocidade();
                if(x < 1){
                    x = 28;
                    
                }else if(x > 28){
                    x = 1;
                    
                }
                break;
            case 3: //esquerda
                x -= getVelocidade();
                if(x < 1){
                    x = 28;
                    
                }else if(x > 28){
                    x = 1;
                   
                }
                break;
        }

        if(isImune()){
            imune --;
            if(!isImune()){
                setCor(5);
            }
        }
    }


    public abstract boolean isMalInformado();


    

    public boolean pessoaExisteEmAgendaContatos(int Id){
        for(int i = 0; i < this.AgendaContatos.size(); i++){
            if(this.AgendaContatos.get(i) == Id){
                return true;
            }
        }
        return false;
    }

    public boolean isImune() {
        return imune != 0;
    }

    public int getImune() {
        return imune;
    }
    
    
    public int setImune(int imune) {
        this.imune = imune;
        return imune;

    }
    
    public boolean isInfectado() {
        return infectado;
    }

    public boolean setInfectado(boolean infectado) {
        this.infectado = infectado;
        return infectado;
    }

    public ArrayList<Integer> getAgendaContatos() {
        return AgendaContatos;
    }

    public void setAgendaContatos(ArrayList<Integer> AgendaContatos) {
        this.AgendaContatos = AgendaContatos;
    }

    public void AdicionaAgendaContatos(int ID) {
        this.AgendaContatos.add(ID);
    }


    public String getWhatsappID() {
        return whatsappID;
    }

    public void setWhatsappID(String whatsappID) {
        this.whatsappID = whatsappID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
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


    
    
    
}