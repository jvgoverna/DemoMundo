/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;

/**
 *
 * @author João Vitor
 */
public class PessoaMalInformada extends Pessoa{



    public PessoaMalInformada(Pessoa p){
        setCor(6);
        setX(p.getX());
        setY(p.getY());
        setVelocidade(p.getVelocidade());
        setInfectado(p.isInfectado());
        setImune(p.getImune());
        setAgendaContatos(p.getAgendaContatos());
        setWhatsappID(p.getWhatsappID());
        setID(p.getID());
    }

    public boolean isMalInformado(){
        return true;
    }
}
