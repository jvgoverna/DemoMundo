/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demomundo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author João Vitor
 */
public class DemoMundo {
    public static void main(String[] args) {
        ArrayList<PessoaBemInformada> pessoabem = new ArrayList<>();

        Mundo mundo = new Mundo();

        Date tempo_inicio = new Date();

        for(int i=0; i<100; i++){
            pessoabem.add(new PessoaBemInformada());
        }

        while(true){
            mundo.refazMapa();
            for(int i = 0;i<pessoabem.size();i++){
                pessoabem.get(i).move();
            }
            mundo.DesenharPessoa(pessoabem);

            Date current_time = new Date();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("====================================");
            System.out.println("Tempo de simulação: " + (current_time.getTime() - tempo_inicio.getTime())/1000);
            System.out.println();
            System.out.println("\u001b[43 \033[0m Bem informados: " + pessoabem.size());
            //System.out.println("\u001b[41 \033[0m Mal informados: " + (mundo.getTamanho() - pessoabem.size()));
            System.out.println("Total de pessoas: " + (int)pessoabem.size());
            mundo.desenhaMundo();

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}