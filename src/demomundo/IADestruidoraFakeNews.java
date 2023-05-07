/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;

/**
 *
 * @author João Vitor
 */
public class IADestruidoraFakeNews {
    private int x,y,xf,yf;

    public IADestruidoraFakeNews(){
        this.x = 3;
        this.y = 50;
        this.xf = 7;
        this.yf = 57;
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

    public boolean isDentro(int x, int y){
        return ( (x >= this.x && x <= this.xf ) && (y >= this.y && y <= this.yf) );
    }

    
}
