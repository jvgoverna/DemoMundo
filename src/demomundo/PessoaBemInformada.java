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
    Pessoa pessoa = new Pessoa();
    
    private ArrayList <PessoaBemInformada> Agenda_BemInformadas = new ArrayList<PessoaBemInformada>();
    
    @Override
    public void move(){
       //Movimento de x e de y 1 em 1 atualizando a newX e newY
        int newX = getX() + rand.nextInt(3) - 1; //Movimento de -1,0 ou 1
        int newY = getY() + rand.nextInt(3) - 1;
        //Verifica se newX e newY estão dentro do limite da tela 60X30
        if(newX >= 1 && newX < 59 && newY >= 1 && newY < 29){
            setX(newX);
            setY(newY);
        }
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
