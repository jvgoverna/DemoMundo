/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;

/**
 *
 * @author João Vitor
 */


public class MeioComunicacaoConfiavel {
    

    private int cor;
    private int time = 30;
    private int x,y,xf,yf;

    

    public MeioComunicacaoConfiavel() {
        this.cor = 7;
        this.x = 13;
        this.y = 17;
        this.xf = 20;
        this.yf = 35;
    }

    

    public int getCor() {
        return cor;
    }

    public void setCor(int cor ){
        this.cor = cor;
    }

    public int getTempoImunizacao(){
        return time;
    }



    public int getTime() {
        return time;
    }



    public void setTime(int time) {
        this.time = time;
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



    public int getXf() {
        return xf;
    }



    public void setXf(int xf) {
        this.xf = xf;
    }



    public int getYf() {
        return yf;
    }



    public void setYf(int yf) {
        this.yf = yf;
    }


    public boolean isDentroMeio(int x, int y){
        return ( (x >= this.x && x <= this.xf ) && (y >= this.y && y <= this.yf) );
    }
}
