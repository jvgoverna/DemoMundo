/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;

/**
 *
 * @author João Vitor
 */
public class Mundo {
    private int coluna = 1;
    private int [][] mapa = new int[][]
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,2,2,0,0,0,0,0,0,0,3,3,0,1},
        {1,0,2,2,0,0,0,0,0,0,0,3,3,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,4,4,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,4,4,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}  
    };
    
    
    
    public void atualizaMundo(){
        mapa[1][coluna] = 2;
        mapa[1][coluna-1] = 0;
        coluna ++;
        if(coluna > mapa.length){
            coluna = 1;
        }
    }
    
    public void desenhaMundo(){
        for(int i = 0 ; i < mapa.length;i++){
            for(int j = 0 ; j < mapa[i].length;j++){
                switch (mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 3:
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 4:
                        System.out.print("\033[46m \033[0m");
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}