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
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Mundo mundo = new Mundo();
        

        mundo.setPessoasmundo(pessoas);
        mundo.GerarPessoasMundo(pessoas);
        //mundo.setPessoasInfectadas(pessoasInfectadas);
        
        Date tempo_inicio = new Date();
        
        while(true){
            try{
                for (Pessoa p : pessoas) {
                    mundo.encontrarVizinhosDeUmaPessoa(p);
                    p.move();
                    
                }

                
                
                mundo.infectarPessoas();
                mundo.desinfectarPessoasMalInformadas();
                mundo.imunizarPessoas();
                Date current_time = new Date();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("====================================");
                System.out.println("Tempo de simulação: " + (current_time.getTime() - tempo_inicio.getTime())/1000);
                System.out.println();
                System.out.println("Total de pessoas: " + (int)pessoas.size());
                System.out.println("\u001b[43m \033[0m Bem informados: " + mundo.numerosdePessoasBemInformadas());
                System.out.println("\u001b[41m \033[0m Mal informadas: " + mundo.numerosdePessoasMalInformadas());
                System.out.println("\u001b[42m \033[0m Imunes: " + mundo.numerodePessoasImunes());
                System.out.println("====================================");
                mundo.refazMapa();
                mundo.DesenharPessoa(pessoas);
                mundo.desenhaMundo();
                Thread.sleep(1000);
                //System.in.read();
                
                

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}