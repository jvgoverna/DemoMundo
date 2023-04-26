/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demomundo;



/**
 *
 * @author João Vitor
 */
public class DemoMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mundo m = new Mundo();
        while(true){
            m.desenhaMundo();
            m.atualizaMundo();
            
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
