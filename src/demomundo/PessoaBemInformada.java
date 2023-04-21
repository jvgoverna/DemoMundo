/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author João Vitor
 */
public class PessoaBemInformada extends Pessoa implements iMovable{
    Random rand = new Random();
    
    private ArrayList <PessoaBemInformada> Agenda_BemInformadas = new ArrayList<PessoaBemInformada>();
    

    //Movimento de x e y de 1 em 1
    @Override
    public void move(){
        
    }

    

    public ArrayList<PessoaBemInformada> getAgenda_BemInformadas() {
        return Agenda_BemInformadas;
    }

    public void setAgenda_BemInformadas(ArrayList<PessoaBemInformada> agenda_BemInformadas) {
        Agenda_BemInformadas = agenda_BemInformadas;
    }
    
    public void Bem_Informados(PessoaBemInformada contato_bem){ //Valor de 100 contatos antes de serem infectados
        for(int i = 0 ; i < 100; i++){
            Agenda_BemInformadas.add(contato_bem);
        }
    }


}
