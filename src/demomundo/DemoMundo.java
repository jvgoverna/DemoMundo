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
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList <IAGeradoraFakeNews> pessoasInfectadas = new ArrayList<>();
        Mundo mundo = new Mundo();

        mundo.setPessoasmundo(pessoas);
        mundo.GerarPessoasMundo(pessoas);
        //mundo.setPessoasInfectadas(pessoasInfectadas);
        
        Date tempo_inicio = new Date();
        
        while(true){
            try{
                
                for(int i = 0;i<pessoas.size();i++){
                    mundo.encontrarVizinhosDeUmaPessoa(pessoas.get(i));
                    pessoas.get(i).move();
                }
                
                mundo.refazMapa();
                mundo.DesenharPessoa(pessoas);
                

                
                
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
                
                
                
                System.out.println("====================================");

                mundo.infectarPessoas();
                mundo.desinfectarPessoasMalInformadas();
                mundo.desenhaMundo();

                Thread.sleep(1000);
                
                

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}