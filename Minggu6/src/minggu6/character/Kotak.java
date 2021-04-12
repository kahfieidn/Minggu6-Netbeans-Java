/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.character;

/**
 *
 * @author Cloud
 */
public class Kotak {
  
    private int x, y;
    
    public Kotak() {
        x = 500;
        y = 200;
    }
    
    public void tampil(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.fillRect(getX(), getY(), 100, 100);
    }
    
    public void kekiri() {
        x--;
    }
    
    public void kekanan() {
        x++;
    }
    
    public void keatas() {
        y--;
    }
    
    public void kebawah() {
        y++;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
